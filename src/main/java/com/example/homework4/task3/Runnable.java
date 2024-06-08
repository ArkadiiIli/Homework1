package com.example.homework4.task3;

import java.util.HashSet;

public class Runnable {

    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet<>();
        Person firstPerson = new Person("Ivan", "Ivanov", 19);
        Person secondPerson = new Person("Ivan", "Ivanov", 19);
        Person thirdPerson = new Person("Kirill", "Ivanov", 20);
        Person fourthPerson = new Person("Ivan", "Ivanov", 25);

        personSet.add(firstPerson);
        personSet.add(secondPerson);
        personSet.add(thirdPerson);
        personSet.add(fourthPerson);

        personSet.forEach(System.out::println);
        System.out.println();

        personSet.remove(thirdPerson);
        personSet.remove(firstPerson);
        System.out.println("Remove two Person from set");
        personSet.forEach(System.out::println);
    }
}
