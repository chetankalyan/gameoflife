package com.fk.gameoflife;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WorldTest {

    @Test
    public void testCreate(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        assertTrue(world.isAliveAt(2, 2));
        assertFalse(world.isAliveAt(2, 4));
    }

    @Test
    public void testGetNeighbours(){
        World world = new World(new String[]{
                ".....",
                "..*..",
                "..*..",
                "..*..",
                "....."});
        List<Cell> neighbours = world.getNeighbours(2, 2);
        assertEquals(8, neighbours.size());
        // Neighbours from left to right, top to bottom
        assertEquals(".", neighbours.get(0).toString());
        assertEquals("*", neighbours.get(1).toString());
        assertEquals(".", neighbours.get(2).toString());
        assertEquals(".", neighbours.get(3).toString());
        assertEquals(".", neighbours.get(4).toString());
        assertEquals(".", neighbours.get(5).toString());
        assertEquals("*", neighbours.get(6).toString());
        assertEquals(".", neighbours.get(7).toString());
    }
}
