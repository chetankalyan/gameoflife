package com.fk.gameoflife;

public class DeadCell implements Cell {
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return ".";
    }
}
