package com.playground.conceptpractice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxSumOfSubArray {

    public int maxWithKedaneAlgo(int[] arrayInFocus) {
        int max_so_far = 0, max_ending_here = 0;
        List<Integer> maxSubArray = new ArrayList<>();
        int max = Arrays.stream(arrayInFocus).max().getAsInt();
        if(max<0)
            return max;
        for (int element : arrayInFocus) {
            maxSubArray.add(element);
            max_ending_here = max_ending_here + element;
            max_so_far = Integer.max(max_so_far, max_ending_here);
            max_ending_here = Integer.max(max_ending_here, 0);
        }
        return max_so_far;
    }
}
