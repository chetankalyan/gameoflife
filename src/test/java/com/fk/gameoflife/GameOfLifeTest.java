package com.fk.gameoflife;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLifeTest {
    @Test
    @Ignore
    public void testOscillatorPattern(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        // T = 1
        world.tick();
        assertEquals(
                ".....\n"+
                ".....\n"+
                ".***.\n"+
                ".....\n"+
                ".....\n", world.getPattern());
        // T = 2
        world.tick();
        assertEquals(
                ".....\n"+
                "..*..\n"+
                "..*..\n"+
                "..*..\n"+
                ".....\n", world.getPattern());
    }
}
