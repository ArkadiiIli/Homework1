package com.example.homework2.task3;

public class Computer {

    public static class Processor {
        private final String model = "Intel";

        public String getDetails() {
            return model;
        }
    }

    public class RAM {
        private final int size = 1024;

        public int getDetails() {
            return size;
        }
    }
}
