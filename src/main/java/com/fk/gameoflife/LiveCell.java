package com.fk.gameoflife;

public class LiveCell extends Cell {
    protected LiveCell(Location location) {
        super(location);
    }

    public boolean isAlive() {
        return true;
    }

    @Override
    public Cell getNextGeneration(World world)  {
        int aliveNeighbourCount = getAliveNeighbourCount(world);
        if(aliveNeighbourCount < 2 || aliveNeighbourCount > 3) {
            return new DeadCell(location);
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return "*";
    }
}
