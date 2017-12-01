package me.defenestration.ericsson;

import me.defenestration.ericsson.connection.protocol.CommandClass;
import me.defenestration.ericsson.connection.protocol.CommonClass;
import me.defenestration.ericsson.connection.protocol.ResponseClass;
import org.capnproto.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private SocketChannel channel;
    private CommonClass.Direction direction = CommonClass.Direction.DOWN;
    private CommonClass.Direction direction2 = CommonClass.Direction.UP;

    public void start() {
        try {
            channel = SocketChannel.open();
            channel.connect(new InetSocketAddress("192.168.8.3", 11222));
        } catch (IOException e) {
            e.printStackTrace();
        }

        sendLogin();

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setFocusable(true);
        frame.setVisible(true);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyChar()) {
                    case 'w':
                        direction = CommonClass.Direction.UP;
                        break;
                    case 's':
                        direction = CommonClass.Direction.DOWN;
                        break;
                    case 'a':
                        direction = CommonClass.Direction.LEFT;
                        break;
                    case 'd':
                        direction = CommonClass.Direction.RIGHT;
                        break;
                }
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        direction2 = CommonClass.Direction.UP;
                        break;
                    case KeyEvent.VK_DOWN:
                        direction2 = CommonClass.Direction.DOWN;
                        break;
                    case KeyEvent.VK_LEFT:
                        direction2 = CommonClass.Direction.LEFT;
                        break;
                    case KeyEvent.VK_RIGHT:
                        direction2 = CommonClass.Direction.RIGHT;
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        ResponseClass.Response.Reader response;

        while (channel.isConnected()) {
            response = getResponse();
            if (response == null)
                continue;

            Map map = new Map();
            ListList.Reader<StructList.Reader<ResponseClass.Cell.Reader>> cells = response.getCells();
            for (int x = 0; x < cells.size(); x++) {
                for (int y = 0; y < cells.get(x).size(); y++) {
                    ResponseClass.Cell.Reader cell = cells.get(x).get(y);
                    map.get(x, y).attackable = cell.getAttack().getCan();
                    map.get(x, y).owner = cell.getOwner();
                    map.get(x, y).attacked = cell.getAttack().isUnit();
                    map.get(x, y).attackedId = cell.getAttack().getUnit();
                }
            }

            ArrayList<Player> players = new ArrayList<>();
            ArrayList<Integer> offsets = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                players.add(new Player(new Player.Unit[2]));
                offsets.add(0);
            }

            int myId = response.getInfo().getOwns();
            ArrayList<Integer> myUnits = new ArrayList<>();

            StructList.Reader<ResponseClass.Unit.Reader> units = response.getUnits();
            for (int i = 0; i < units.size(); i++) {
                int owner = units.get(i).getOwner();
                System.out.println(owner + " " + myId);
                if (owner == myId)
                    myUnits.add(i);
                /*Player.Unit unit = new Player.Unit();
                unit.x = units.get(i).getPosition().getX();
                unit.y = units.get(i).getPosition().getY();
                CommonClass.Direction dir = units.get(i).getDirection();
                if (dir == CommonClass.Direction.LEFT)
                    unit.vx = -1;
                if (dir == CommonClass.Direction.RIGHT)
                    unit.vy = 1;
                if (dir == CommonClass.Direction.UP)
                    unit.vy = 1;
                if (dir == CommonClass.Direction.DOWN)
                    unit.vy = -1;
                unit.id = i;
                players.get(owner).units[offsets.get(owner)] = unit;*/
            }

            MessageBuilder message = new MessageBuilder();
            CommandClass.Command.Builder commandBuilder = message.initRoot(CommandClass.Command.factory);
            CommandClass.Command.Commands.Builder command = commandBuilder.initCommands();
            StructList.Builder<CommandClass.Move.Builder> moves = command.initMoves(2);

            moves.get(0).setDirection(CommonClass.Direction.lookup[new Random().nextInt(4)]);
            moves.get(0).setUnit(myUnits.get(0));
            moves.get(1).setDirection(CommonClass.Direction.lookup[new Random().nextInt(4)]);
            moves.get(1).setUnit(myUnits.get(1));

            try {
                SerializePacked.writeToUnbuffered(channel, message);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private ResponseClass.Response.Reader getResponse() {
        try {
            MessageReader msgReader = SerializePacked.readFromUnbuffered(channel);
            return msgReader.getRoot(ResponseClass.Response.factory);
        } catch (IOException e) {
            //e.printStackTrace();
        }
        return null;
    }

    private void sendLogin() {
        System.out.println("Sending login...");
        MessageBuilder msgBuilder = new MessageBuilder();
        CommandClass.Command.Builder loginRequest = msgBuilder.initRoot(CommandClass.Command.factory);
        CommandClass.Command.Commands.Builder commands = loginRequest.initCommands();
        CommandClass.Command.Commands.Login.Builder login = commands.initLogin();
        login.setTeam("defenestration");
        login.setHash("6ilwor8e6t3yv2kwvbwu5d5obl1upmu2ywteh");

        try {
            SerializePacked.writeToUnbuffered(channel, msgBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
}