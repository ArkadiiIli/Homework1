package com.example.homework4.task1;

import java.util.ArrayList;

public class Runnable {

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>();

        countryList.add("Russia");
        countryList.add("USA");
        countryList.add("Japan");
        System.out.println(countryList);

        countryList.set(1, "Canada");
        System.out.println();
        System.out.println(countryList);

        countryList.remove(1);
        System.out.println();
        System.out.println(countryList);

        countryList.remove("Japan");
        System.out.println();
        System.out.println(countryList);

        int index = countryList.indexOf("Russia");
        System.out.println();
        System.out.println("Index of Russia = " + index);

        boolean isContain = countryList.contains("Japan");
        System.out.println();
        System.out.println("countryList contains Japan = " + isContain);
    }
}
