package com.example.homework3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runnable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            showLongestAndShortestStrings(getStringFromConsole(scanner, 3));
            showStringsWithLengthLessThanAverage(getStringFromConsole(scanner, 3));
            showWordWithUniqueLetters(getStringFromConsole(scanner, 3));
            showDuplicateLetters(getStringFromConsole(scanner, 1));
        }
    }

    private static void showDuplicateLetters(List<String> stringFromConsole) {
        stringFromConsole.forEach(line -> {
            System.out.println(duplicateLetters(line));
        });
    }

    private static String duplicateLetters(String line) {
        return line
                .chars()
                .mapToObj(c -> Character.toString((char) c))
                .map(s -> s.repeat(2))
                .collect(Collectors.joining());
    }

    private static void showWordWithUniqueLetters(List<String> threeStringFromConsole) {
        Optional<String> result = threeStringFromConsole.stream()
                .filter(line -> line.split("\\s+").length > 0)
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> word.length() >= 3 && hasUniqueCharacters(word))
                .findFirst();

        result.ifPresent(word -> {
            System.out.println();
            System.out.println("First Word with unique letters: " + word);
        });
    }

    private static boolean hasUniqueCharacters(String word) {
        return word.chars().distinct().count() == word.length();
    }

    private static void showStringsWithLengthLessThanAverage(List<String> threeStringFromConsole) {
        double average = threeStringFromConsole.stream().mapToInt(String::length).average().orElse(0.0);

        System.out.println();
        System.out.println("Strings with length less than average:");
        threeStringFromConsole.stream().filter(line -> line.length() < average).forEach(System.out::println);
    }

    private static void showLongestAndShortestStrings(List<String> threeStringFromConsole) {
        String longest = threeStringFromConsole.stream().max(Comparator.comparingInt(String::length)).orElse("");
        String shortest = threeStringFromConsole.stream().min(Comparator.comparingInt(String::length)).orElse("");
        System.out.println();
        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);
    }

    private static List<String> getStringFromConsole(Scanner scanner, int limit) {
        return Stream.generate(scanner::nextLine)
                .limit(limit)
                .collect(Collectors.toList());

    }
}
