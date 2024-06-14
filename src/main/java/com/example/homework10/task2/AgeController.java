package com.example.homework10.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {
    private final static int ADULT_AGE = 18;
    private final static String ADULT_TEXT = "Adult";
    private final static String MINOR_TEXT = "Minor";

    @GetMapping("/")
    public String getAgeStatus(@RequestParam int age) {
        if (age >= ADULT_AGE) return ADULT_TEXT;
        else return MINOR_TEXT;
    }
}
