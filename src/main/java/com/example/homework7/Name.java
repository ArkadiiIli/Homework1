package com.example.homework7;

public enum Name {
    ALICE("Alice"),
    BOB("Bob"),
    CHARLIE("Charlie"),
    DAVID("David"),
    ELLA("Ella"),
    FRANK("Frank"),
    GRACE("Grace"),
    HARRY("Harry"),
    ISABELLA("Isabella"),
    JACK("Jack"),
    KAREN("Karen"),
    LEO("Leo"),
    MARY("Mary"),
    NATHAN("Nathan"),
    OLIVIA("Olivia"),
    PETER("Peter");

    private final String name;

    Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
