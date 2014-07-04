package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameOfLifeRuleTest {
    @Test
    public void testUnderpopulationRule(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        // T = 1
        assertTrue(world.isAliveAt(1,2));
        world.tick();
        assertFalse(world.isAliveAt(1, 2));
    }
}
