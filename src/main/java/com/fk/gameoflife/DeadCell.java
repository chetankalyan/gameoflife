package com.fk.gameoflife;

public class DeadCell extends Cell {
    protected DeadCell(Location location) {
        super(location);
    }

    public boolean isAlive() {
        return false;
    }

    @Override
    public Cell getNextGeneration(World world) {

        int aliveNeighbourCount = getAliveNeighbourCount(world);
        if(aliveNeighbourCount == 3) {
            return new LiveCell(location);
        } else {
            return this;
        }

    }

    @Override
    public String toString() {
        return ".";
    }
}
