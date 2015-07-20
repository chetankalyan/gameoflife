package com.fk.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by chetan.k on 7/20/15.
 */
public class Rule3Test {
    @Test
    public void testOverpopulationRule() throws Exception {
        GameWorld world = new World(new String[]{
                ".*.",
                "***",
                ".*."});
        // T = 0
        assertTrue(world.isAliveAt(1,1));
        // T = 1
        world.tick();
        assertFalse(world.isAliveAt(1, 1));
    }
}
