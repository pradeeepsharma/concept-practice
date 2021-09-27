package com.playground.conceptpractice.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamsTest {
    private Streams streams;

    @BeforeEach
    void setUp() {
        streams = new Streams();
    }

    @Test
    void smallestInArray() {
    }

    @Test
    void maxInArray() {
    }

    @Test
    void naturallySorted() {
    }

    @Test
    void reverseSorted() {
    }

    @Test
    void findPairs() {
        List<Combination> pairs = streams.findPairs(17, Stream.of(3, 7, 10, 5).collect(Collectors.toList()));
        assertTrue(pairs.size()==1);
    }
}