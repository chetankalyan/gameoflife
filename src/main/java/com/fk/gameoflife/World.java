package com.fk.gameoflife;

import java.util.List;

public class World {

    private Cell[][] cells;

    public World(String[] seedPattern) {
        this.cells = new Cell[seedPattern.length][seedPattern[0].length()];
        int i = 0;
        for (String row : seedPattern) {
            int j = 0;
            for (char c : row.toCharArray()) {
                this.cells[i][j] = c == '.' ? new DeadCell() : new LiveCell();
                j++;
            }
            i++;
        }
    }

    public void tick() {

    }

    public String[] getPattern() {
        return null;
    }

    public boolean isAliveAt(int x, int y) {
        return cells[x][y].isAlive();
    }

    public List<Object> getNeighbours(int x, int y) {
        return null;
    }
}
