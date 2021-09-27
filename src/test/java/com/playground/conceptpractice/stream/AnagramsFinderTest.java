package com.playground.conceptpractice.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsFinderTest {

    @Test
    void verifyIfAnagram() {
        AnagramsFinder finder = new AnagramsFinder();
        assertTrue(finder.verifyIfAnagram("abc", "bca"));
        assertFalse(finder.verifyIfAnagram("abc", "aac"));
        assertTrue(finder.verifyIfAnagram("abc", "ABC"));
    }
}