package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Rule4Test {
    @Test
    public void testBornRuleForExactly3AliveNeighbours(){
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
    public void testBornRuleNotAppliedForMoreThan3AliveNeighbours(){
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
