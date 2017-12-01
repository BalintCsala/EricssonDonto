package me.defenestration.ericsson;

public class Map {

    public class Cell {
        public boolean attackable = false;
        public int owner = -1;
        public boolean attacked = false;
        public int attackedId = -1;
    }

    public Map() {
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                map[x][y] = new Cell();
            }
        }
    }

    public Cell[][] map = new Cell[120][90];

    public Cell get(int x, int y) {
        if (x < 0 || x >= 120 || y < 0 || y >= 90)
            return new Cell();
        return map[x][y];
    }

}
