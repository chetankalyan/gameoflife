package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Rule3Test {
    @Test
    public void testOverpopulationRule(){
        World world = new World(new String[]{
                ".*.",
                "***",
                ".*."});
        // T = 0
        assertTrue(world.isAliveAt(1, 1));
        System.out.println(world.toString());
        // T = 1
        world.tick();
        System.out.println(world.toString());
        assertFalse(world.isAliveAt(1, 1));
    }
}
