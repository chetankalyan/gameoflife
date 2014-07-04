package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    @Test
    public void testOscillatorPattern(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        // T = 1
        world.tick();
        assertEquals(new String[]{
                ".....",
                ".....",
                ".***.",
                ".....",
                "....."}, world.getPattern());
        // T = 2
        world.tick();
        assertEquals(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."}, world.getPattern());
    }
}
