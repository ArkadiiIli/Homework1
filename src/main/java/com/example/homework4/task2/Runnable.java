package com.example.homework4.task2;

import java.util.LinkedList;

public class Runnable {

    public static void main(String[] args) {
        LinkedList<String> countryList = new LinkedList<>();

        countryList.addFirst("Russia");
        countryList.addFirst("USA");
        countryList.addLast("France");
        countryList.addLast("Sweden");
        System.out.println(countryList);
        System.out.println();

        countryList.removeFirst();
        countryList.removeLast();
        System.out.println(countryList);
        System.out.println();

        String firstElement = countryList.getFirst();
        String lastElement = countryList.getLast();
        System.out.println("FirstElement = " + firstElement);
        System.out.println("LastElement = " + lastElement);
    }
}
