package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfiniteWorldTest {
    @Test
    public void testGliderPattern() throws Exception {
        World world = new World(new String[]{
                "....",
                "...*",
                ".*.*",
                "..**"});
        // T = 1
        world.tick();
        assertEquals(
                ".....\n" +
                        "..*..\n" +
                        "...**\n" +
                        "..**.\n", world.getPattern());
        // T = 2
        world.tick();
        assertEquals(
                ".....\n" +
                        "...*.\n" +
                        "....*\n" +
                        "..***\n", world.getPattern());
        // T = 3
        world.tick();
        assertEquals(
                ".....\n" +
                        ".....\n" +
                        "..*.*\n" +
                        "...**\n" +
                        "...*.\n", world.getPattern());
        // T = 4
        world.tick();
        assertEquals(
                ".....\n" +
                        ".....\n" +
                        "....*\n" +
                        "..*.*\n" +
                        "...**\n", world.getPattern());
    }
}
