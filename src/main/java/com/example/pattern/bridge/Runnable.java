package com.example.pattern.bridge;

public class Runnable {
    public static void main(String[] args) {
        Mp3Record mp3Record = new Mp3Record("I Will Always Love You");
        FlacRecord flacRecord = new FlacRecord("Crazy for You");

        WinampPlayer winampPlayer = new WinampPlayer();
        WmpPlayer wmpPlayer = new WmpPlayer();

        winampPlayer.setRecord(mp3Record);
        winampPlayer.play();
        winampPlayer.stop();
        winampPlayer.volumeDown();

        wmpPlayer.setRecord(flacRecord);
        wmpPlayer.play();
        wmpPlayer.stop();
        wmpPlayer.volumeDown();

    }
}
