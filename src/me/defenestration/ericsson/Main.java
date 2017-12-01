package me.defenestration.ericsson;

import me.defenestration.ericsson.connection.protocol.CommandClass;
import me.defenestration.ericsson.connection.protocol.CommonClass;
import me.defenestration.ericsson.connection.protocol.ResponseClass;
import org.capnproto.*;

import java.awt.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;

public class Main {

    private SocketChannel channel;

    public void start() {
        try {
            channel = SocketChannel.open();
            channel.connect(new InetSocketAddress("192.168.8.3", 11222));
        } catch (IOException e) {
            e.printStackTrace();
        }

        sendLogin();

        System.out.println("Sent login");

        ResponseClass.Response.Reader response;

        while (channel.isConnected()) {
//            response = getResponse();
//            if (response == null)
//                continue;

            MessageBuilder message = new MessageBuilder();
            CommandClass.Command.Builder commandBuilder = message.initRoot(CommandClass.Command.factory);
            CommandClass.Command.Commands.Builder command = commandBuilder.initCommands();
            StructList.Builder<CommandClass.Move.Builder> moves = command.initMoves(2);

            moves.get(0).setDirection(CommonClass.Direction.RIGHT);
            moves.get(0).setUnit(0);
            moves.get(1).setDirection(CommonClass.Direction.LEFT);
            moves.get(1).setUnit(1);

            try {
                SerializePacked.writeToUnbuffered(channel, message);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
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