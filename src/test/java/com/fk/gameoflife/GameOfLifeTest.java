package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    String[] startPattern = new String[]{
            ".....",
            "..*..",
            "..*..",
            "..*..",
            "....."
    };
    String[] endPattern = new String[] {
            ".....",
            ".....",
            ".***.",
            ".....",
            "....."
    };
    @Test
    public void testOscillatorPattern() throws Exception {
        World world = new World(startPattern);
        // T = 1
        world.tick();
        String[] pattern = world.getPattern();
        assertEquals(endPattern.length, pattern.length);
        for (int i = 0; i < pattern.length; i++) {
            pattern[i] = pattern[i].trim();
            assertEquals(endPattern[i], pattern[i]);
        }
        // T = 2
        world.tick();
        pattern = world.getPattern();
        assertEquals(startPattern.length, pattern.length);
        for (int i = 0; i < pattern.length; i++) {
            pattern[i] = pattern[i].trim();
            assertEquals(startPattern[i], pattern[i]);
        }
    }
}
