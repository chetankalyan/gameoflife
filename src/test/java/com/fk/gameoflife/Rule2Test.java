package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Rule2Test {
    @Test
    public void testStayAliveRuleWithExactly2Neighbours(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        // T = 0
        assertTrue(world.isAliveAt(2,2));
        // T = 1
        world.tick();
        assertTrue(world.isAliveAt(2,2));
    }

    @Test
    public void testStayAliveRuleWithExactly3Neighbours(){
        World world = new World(new String[]{
                "....",
                ".**.",
                ".**.",
                "...."});
        // T = 0
        assertTrue(world.isAliveAt(1,1));
        // T = 1
        world.tick();
        assertTrue(world.isAliveAt(1,1));
    }
}
