package com.playground.conceptpractice.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberFinderTest {

        private OddNumberFinder oddFinder = new OddNumberFinder();
    @Test
    void findOddNumbersIn() {
        List<Integer> randomList = IntStream.range(0, 101).mapToObj(Integer::valueOf).collect(Collectors.toList());
        List<Integer> oddNumbersIn = oddFinder.findOddNumbersIn(randomList);
        assertEquals(50,oddNumbersIn.size());
        assertEquals(51, oddNumbersIn.get(25));
    }

    @Test
    void getSumOfSquareOFOddNumbers(){
       assertEquals(1, oddFinder.sumOfSquareOfOddNumbers(IntStream.range(0,3).mapToObj(Integer::valueOf).collect(Collectors.toList())));
       assertEquals(166650, oddFinder.sumOfSquareOfOddNumbers(IntStream.range(0, 100).mapToObj(Integer::valueOf).collect(Collectors.toList())));
    }
}