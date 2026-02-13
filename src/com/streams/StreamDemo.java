package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        System.out.println("Stream API Project Started");

        // UC 2.1
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream().forEach(n -> System.out.println(n));

        // UC 2.2
        numbers.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));

        // UC 2.3
        List<Integer> doubledList = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubledList);

        // UC 2.4
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // UC 2.5
        Integer firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .orElse(null);
        System.out.println(firstEven);

        // UC 2.6
        Integer minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo)
                .orElse(null);
        System.out.println(minEven);

        Integer maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println(maxEven);

        // UC 2.7
        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

        double average = numbers.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);
        System.out.println(average);

        // UC 2.8
        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println(allEven);

        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven);

        // UC 2.9
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }
}

