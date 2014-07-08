package com.fk.gameoflife;

import java.util.ArrayList;
import java.util.List;

public abstract class Cell {
    protected Location location;

    protected Cell(Location location) {
        this.location = location;
    }

    public abstract boolean isAlive();

    public List<Cell> getNeighbours(World world) {
        List<Location> neighbourLocations = this.location.getNeighbourLocations();
        ArrayList<Cell> neighbours = new ArrayList<Cell>();
        for (Location location : neighbourLocations) {
            if(location.within(world.getMaxRow(), world.getMaxCol())){
                neighbours.add(world.getCellAt(location.getX(), location.getY()));
            }
        }
        return neighbours;
    }

    public int getAliveNeighbourCount(World world) {
        List<Cell> neighbours = getNeighbours(world);
        int count = 0;
        for (Cell cell : neighbours) {
            if(cell.isAlive()){
                count++;
            }
        }
        return count;
    }

    public abstract Cell getNextGeneration(World world);
}
