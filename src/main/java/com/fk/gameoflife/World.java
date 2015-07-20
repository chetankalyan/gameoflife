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
        Cell[][] nextCells = new Cell[maxRow][maxCol];
        for(int i=0; i<maxRow; i++){
            for(int j=0; j<maxCol; j++){
                Cell cell = this.cells[i][j];
                nextCells[i][j] = cell.getNextGeneration(this);
            }
        }
        this.cells = nextCells;
    }

    public String getPattern() {
        String pattern = "";
        for (int i =0; i<maxRow; i++){
            for(int j=0; j<maxCol; j++){
                pattern += this.cells[i][j].toString();
            }
            pattern += "\n";
        }
        return pattern;
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

    public int getMaxRow() {
        return maxRow;
    }

    public int getMaxCol() {
        return maxCol;
    }

    public int getAliveNeighbourCount(int x, int y) {
        Cell cell = this.cells[x][y];
        return cell.getAliveNeighbourCount(this);
    }

    @Override
    public String toString() {
        return this.getPattern();
    }
}
