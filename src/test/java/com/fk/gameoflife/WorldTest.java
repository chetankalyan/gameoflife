package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class WorldTest {

    @Test
    public void testCreate() {
        GameWorld world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        assertNotNull(world);
        assertTrue(world.isAliveAt(2, 2));
        assertFalse(world.isAliveAt(2, 4));
    }
}
