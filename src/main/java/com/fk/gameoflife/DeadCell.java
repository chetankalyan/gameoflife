package com.fk.gameoflife;

public class DeadCell extends Cell {
    protected DeadCell(Location location) {
        super(location);
    }

    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return ".";
    }
}
