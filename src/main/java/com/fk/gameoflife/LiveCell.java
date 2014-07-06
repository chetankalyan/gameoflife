package com.fk.gameoflife;

public class LiveCell extends Cell {
    protected LiveCell(Location location) {
        super(location);
    }

    public boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return "*";
    }
}
