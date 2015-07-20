package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class Rule1Test {
    @Test
    public void testUnderpopulationRule(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        // T = 0
        assertTrue(world.isAliveAt(1,2));
        // T = 1
        world.tick();
        assertFalse(world.isAliveAt(1, 2));
    }

}
