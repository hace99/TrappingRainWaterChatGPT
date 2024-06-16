package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    public void normalCase(){
        TrappingRainWater trapper = new TrappingRainWater();
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, trapper.trap(heights));
    }

    @Test
    public void normalCase2(){
        TrappingRainWater trapper = new TrappingRainWater();
        int[] heights = {4, 0, 2, 3, 5, 0, 1};
        assertEquals(8, trapper.trap(heights));
    }

    @Test
    public void emptyCase(){
        TrappingRainWater trapper = new TrappingRainWater();
        int[] heights = {3};
        assertEquals(0, trapper.trap(heights));
    }

    @Test
    public void emptyCasew(){
        TrappingRainWater trapper = new TrappingRainWater();
        int[] heights = {3};
        assertEquals(0, trapper.trap(heights));
    }
}