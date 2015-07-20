package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by chetan.k on 7/20/15.
 */
public class Rule2Test {
    @Test
    public void testStayAliveRuleWithExactly2Neighbours() throws Exception {
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
    public void testStayAliveRuleWithExactly3Neighbours() throws Exception {
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
