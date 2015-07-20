package com.fk.gameoflife;

import java.util.List;

/**
 * Created by chetan.k on 7/20/15.
 */
public interface GameWorld<T> {
    /**
     * On tick, the world goes through one generation.
     */
    void tick() throws Exception;

    /**
     * Invoked before and after a tick.
     *
     * @return the pattern of the world as it is now
     */
    String[] getPattern();

    /**
     * Helper method to check if the entry at (row, column) is alive or not.
     *
     * @param row
     * @param column
     * @return
     */
    boolean isAliveAt(int row, int column);

    /**
     * Method to get the neighbours of a particular cell
     *
     * @param x
     * @param y
     * @return list of cells, of type T
     */
    List<T> getNeighbours(int x, int y);
}
