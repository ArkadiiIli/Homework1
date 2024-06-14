package com.example.homework10.task1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final String MINSK_ZONE = "+3";
    private static final String WASHINGTON_ZONE = "-4";
    private static final String BEIJING_ZONE = "+8";

    @GetMapping("/minsk")
    public String getMinskTime() {
        return getCurrentTime(MINSK_ZONE);
    }

    @GetMapping("/washington")
    public String getWashingtonTime() {
        return getCurrentTime(WASHINGTON_ZONE);
    }

    @GetMapping("/beijing")
    public String getBeijingTime() {
        return getCurrentTime(BEIJING_ZONE);
    }

    private String getCurrentTime(String timeZone) {
        ZoneOffset zoneOffset = ZoneOffset.of(timeZone);
        ZonedDateTime currentTime = ZonedDateTime.now(zoneOffset);
        return formatter.format(currentTime);
    }
}
