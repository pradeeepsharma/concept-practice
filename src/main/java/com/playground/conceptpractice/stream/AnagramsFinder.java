package com.playground.conceptpractice.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class AnagramsFinder {

    public boolean verifyIfAnagram(String value1, String value2) {
        char[] charsFor1 = value1.toUpperCase().toCharArray();
        char[] charsFor2 = value2.toUpperCase().toCharArray();
        if (charsFor1.length != charsFor2.length)
            return false;
        Arrays.sort(charsFor1);
        Arrays.sort(charsFor2);
       // Stream.of(charsFor2).map(element->Character.toUpperCase(element));
        return Arrays.equals(charsFor1, charsFor2);

    }
}
