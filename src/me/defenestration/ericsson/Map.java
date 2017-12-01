package me.defenestration.ericsson;

public class Map {

    public class Cell {
        public boolean attackable;
        public int owner;

        public Cell(boolean attackable, int owner) {
            this.attackable = attackable;
            this.owner = owner;
        }
    }

    public Map() {
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                map[x][y] = new Cell(false, -1);
            }
        }
    }

    public Cell[][] map = new Cell[120][90];

    public Cell get(int x, int y) {
        if (x < 0 || x >= 120 || y < 0 || y >= 90)
            return new Cell(false, -1);
        return map[x][y];
    }

}
