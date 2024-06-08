package com.example.homework5.task1;

import java.util.Arrays;

public class Runnable {

    public static void main(String[] args) {
        int sum = Arrays.asList(1, 2, 2, 3, 99, 99, 100, 100, 12, 11)
                .stream()
                .mapToInt(Integer::intValue)
                .distinct().
                filter(i -> i % 2 == 0)
                .sum();

        System.out.println(sum);
    }
}
