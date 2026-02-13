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
    }
}

