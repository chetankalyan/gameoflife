package com.fk.gameoflife;

import java.util.List;

/**
 * World was created using a seed pattern before.
 * Now world needs to implement the GameWorld interface.
 */
public class World implements GameWorld {

    public World(String[] seedPattern) {
    }

    @Override
    public void tick() {
        //Auto-generated method stub
    }

    @Override
    public String[] getPattern() {
        return new String[0];  //Auto-generated method stub
    }

    @Override
    public boolean isAliveAt(int row, int column) {
        return false;  //Auto-generated method stub
    }

    @Override
    public List getNeighbours(int x, int y) {
        return null;  //Auto-generated method stub
    }
}
