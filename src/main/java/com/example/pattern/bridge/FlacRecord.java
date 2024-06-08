package com.example.pattern.bridge;

public class FlacRecord implements Record {
    private final String name;

    public FlacRecord(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Play " + name + " " + getFormat());
    }

    @Override
    public void stop() {
        System.out.println("Stop " + name + " " + getFormat());
    }

    @Override
    public String getName() {
        return name;
    }

    public String getFormat() {
        return "flac";
    }
}
