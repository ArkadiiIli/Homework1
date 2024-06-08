package com.example.homework2.task2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        MutablePerson mutablePerson =
                new MutablePerson(
                        "Tom",
                        40,
                        List.of("Reading", "Hiking", "Painting")
                );
        ImmutablePerson immutablePerson =
                new ImmutablePerson(
                        "Elizabeth",
                        25,
                        List.of("Gardening", "Cooking", "Photography")
                );

        System.out.println(mutablePerson);
        System.out.println(immutablePerson);
        System.out.println();

        //Change mutablePerson
        mutablePerson.setName("Olga");
        mutablePerson.setAge(18);
        mutablePerson.setHobbies(List.of("Cycling", "Writing", "Traveling"));

        System.out.println(mutablePerson);

        //Change immutablePerson
        immutablePerson.getHobbies().clear();
    }
}
