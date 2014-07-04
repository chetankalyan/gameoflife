package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorldTest {

    @Test
    public void testCreate(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        assertEquals(".....\n" +
                "..*..\n" +
                "..*..\n" +
                "..*..\n" +
                ".....\n", world.toString());
    }}
