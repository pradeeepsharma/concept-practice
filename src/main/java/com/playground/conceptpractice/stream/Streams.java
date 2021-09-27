package com.playground.conceptpractice.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public int smallestInArray(int[] randomArray) {
        int smallest = Arrays.stream(randomArray).min().getAsInt();
        return smallest;
    }

    public int maxInArray(int[] randomArray) {
        int maxElement = Arrays.stream(randomArray).max().getAsInt();
        return maxElement;
    }

    public List<Integer> naturallySorted() {
        List<Integer> sortedList = Stream.of(34, 56, 12, 56, 78, 11, 21, 89, 34, 67, 32, 67, 60).sorted().collect(Collectors.toList());
        return sortedList;
    }

    public List<Integer> reverseSorted() {
        List<Integer> sortedList = Stream.of(34, 56, 12, 56, 78, 11, 21, 89, 34, 67, 32, 67, 60).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return sortedList;
    }

    public List<Combination> findPairs(int desiredNumber, List<Integer> integerList) {
        boolean flag = false;
        HashSet<Integer> hashSet = new HashSet<>();
        List<Combination> combinations = new ArrayList<>();
        integerList.stream().forEach(element ->
        {
            System.out.println("Element being matched :" + element);
            hashSet.stream().forEach(mapElement -> System.out.println(mapElement + ","));
            if (hashSet.contains(desiredNumber - element)) {
                combinations.add(new Combination(element, desiredNumber - element));
            }
            hashSet.add(element);
        });

        return combinations;
    }


}

class Combination {
    private int value1;
    private int value2;

    public Combination(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    Integer sum() {
        return value1 + value2;
    }

    @Override
    public String toString() {
        return "Combination{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}