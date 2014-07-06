package com.fk.gameoflife;

import java.util.List;

public class World {

    private final int maxRow;
    private final int maxCol;
    private Cell[][] cells;

    public World(String[] seedPattern) {
        this.maxRow = seedPattern.length;
        this.maxCol = seedPattern[0].length();
        this.cells = new Cell[maxRow][maxCol];
        int i = 0;
        for (String row : seedPattern) {
            int j = 0;
            for (char c : row.toCharArray()) {
                Location location = new Location(i, j);
                this.cells[i][j] = c == '.' ? new DeadCell(location) : new LiveCell(location);
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

    public List<Cell> getNeighbours(int x, int y) {
        Cell cell = this.cells[x][y];
        return cell.getNeighbours(this);
    }

    public Cell getCellAt(int x, int y) {
        return cells[x][y];
    }
}
