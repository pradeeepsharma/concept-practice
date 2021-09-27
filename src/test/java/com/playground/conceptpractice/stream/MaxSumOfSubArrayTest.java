package com.playground.conceptpractice.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumOfSubArrayTest {

    @Test
    void maxWithKedaneAlgo() {
        MaxSumOfSubArray maxSumOfSubArray = new MaxSumOfSubArray();
        int maxSum = maxSumOfSubArray.maxWithKedaneAlgo(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, maxSum);

    }

    @Test
    void maxWithKedaneAlgoWitAllNegative() {
        MaxSumOfSubArray maxSumOfSubArray = new MaxSumOfSubArray();
        int maxSum = maxSumOfSubArray.maxWithKedaneAlgo(new int[]{ -8, -3, -6, -2, -5, -4});
        assertEquals(-2, maxSum);

    }
}