package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;


public class Rule1Test {
    @Test
    public void testUnderpopulationRule(){
        GameWorld world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        // T = 0
        assertTrue(world.isAliveAt(1,2));
        // T = 1
        assertTrue(world.isAliveAt(1,2));
        try{
            world.tick();
        } catch(Exception e) {
            fail("Tick failed");
        }
        assertFalse(world.isAliveAt(1, 2));
    }
}
