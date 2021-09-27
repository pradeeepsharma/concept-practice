package com.playground.conceptpractice.stream;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberFinder {
    public List<Integer> findOddNumbersIn(List<Integer> randomNumbers) {

        return randomNumbers.stream()
                .filter(element -> element % 2 == 1)
                .collect(Collectors.toList());
    }

    public int sumOfSquareOfOddNumbers(List<Integer> randomNumbers){
        Integer reduced = randomNumbers.stream()
                .filter(element -> element % 2 == 1)
                .map(element -> ((int) Math.round(Math.pow(element, 2))))
                .reduce(0, Integer::sum);
        //.collect(Collectors.toList());
        return reduced;
    }
}
