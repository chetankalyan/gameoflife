package com.fk.gameoflife;

public class LiveCell implements Cell {
    public boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return "*";
    }
}
