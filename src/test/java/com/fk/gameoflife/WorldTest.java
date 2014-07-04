package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorldTest {
    @Test
    public void testOscillatorPattern(){
        World world = new World(
                ".....\n" +
                "..*..\n" +
                "..*..\n" +
                "..*..\n" +
                ".....");
        // T = 1
        world.tick();
        assertEquals(".....\n" +
                ".....\n" +
                ".***.\n" +
                ".....\n" +
                ".....", world.getPattern());
        // T = 2
        world.tick();
        assertEquals(
                ".....\n" +
                "..*..\n" +
                "..*..\n" +
                "..*..\n" +
                ".....", world.getPattern());
    }
}
