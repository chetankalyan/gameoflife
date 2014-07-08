package com.fk.gameoflife;

import java.util.Arrays;
import java.util.List;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<Location> getNeighbourLocations() {
        return Arrays.asList(
                topLeft(), top(), topRight(),
                left(), right(),
                botLeft(), bottom(), bottomRight()
        );
    }

    private Location topLeft() {
        return new Location(x-1, y-1);
    }

    private Location topRight() {
        return new Location(x-1,y+1);
    }

    private Location top() {
        return new Location(x-1,y);
    }

    private Location left() {
        return new Location(x,y-1);
    }

    private Location right() {
        return new Location(x,y+1);
    }

    private Location botLeft() {
        return new Location(x+1,y-1);
    }

    private Location bottom() {
        return new Location(x+1,y);
    }

    private Location bottomRight() {
        return new Location(x+1,y+1);
    }

    public boolean within(int maxRow, int maxCol) {
        return x >= 0 && x < maxRow && y >= 0 && y < maxCol;
    }
}
