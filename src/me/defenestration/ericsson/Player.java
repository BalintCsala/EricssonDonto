package me.defenestration.ericsson;

public class Player {

    public static class Unit {
        public int x = 0;
        public int y = 0;
        public int vx = 0;
        public int vy = 0;
        public int id = -1;
    }

    public Unit[] units = new Unit[2];

    public Player(Unit[] units) {
        this.units = units;
    }

}
