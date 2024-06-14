package com.example.homework9.bridge;

public class WinampPlayer implements Player {
    private Record record = null;
    private int volume = 100;
    @Override
    public void play() {
        if (record != null) record.play();
        else System.out.println("Please set record");
    }

    @Override
    public void stop() {
        if (record != null) record.stop();
        else System.out.println("Please set record");
    }

    @Override
    public void volumeDown() {
        if (volume > 0) volume--;
        System.out.println("Volume is " + volume);

    }

    @Override
    public void volumeUp() {
        if (volume < 100) volume++;
        System.out.println("Volume is " + volume);
    }

    public void setRecord(Record record) {
        this.record = record;
        System.out.println("Set " + record.getName());
    }
}
