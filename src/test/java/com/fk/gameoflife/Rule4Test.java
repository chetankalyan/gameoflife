package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by chetan.k on 7/20/15.
 */
public class Rule4Test {
    @Test
    public void testBornRuleForExactly3AliveNeighbours() throws Exception {
        World world = new World(new String[]{
                ".....",
                "..*..",
                "*.*..",
                "..*..",
                "....."});
        // T = 0
        assertFalse(world.isAliveAt(2, 3));
        // T = 1
        world.tick();
        assertTrue(world.isAliveAt(2, 3));
    }

    @Test
    public void testBornRuleNotAppliedForMoreThan3AliveNeighbours() throws Exception {
        World world = new World(new String[]{
                ".....",
                "..*..",
                "*.*..",
                "..*..",
                "....."});
        // T = 0
        assertFalse(world.isAliveAt(2, 1));
        // T = 1
        world.tick();
        assertFalse(world.isAliveAt(2, 1));
    }
}
