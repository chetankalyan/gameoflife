package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class WorldTest {

    @Test
    public void testCreate(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        assertNotNull(world);
    }}
