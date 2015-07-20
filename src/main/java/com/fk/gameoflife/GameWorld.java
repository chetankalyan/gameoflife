package com.fk.gameoflife;

/**
 * Created by chetan.k on 7/20/15.
 */
public interface GameWorld {
    /**
     * On tick, the world goes through one generation.
     */
    void tick();

    /**
     * Invoked before and after a tick.
     * @return the pattern of the world as it is now
     */
    String[] getPattern();

    /**
     * Helper method to check if the entry at (row, column) is alive or not.
     * @param row
     * @param column
     * @return
     */
    boolean isAliveAt(int row, int column);
}
