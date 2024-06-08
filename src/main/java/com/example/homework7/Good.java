package com.example.homework7;

public enum Good {
    WATERMELON("Watermelon"),
    COFFEE("Coffee"),
    BRUSH("Brush"),
    LAPTOP("Laptop"),
    NOTEBOOK("Notebook"),
    HEADPHONES("Headphones"),
    SUNGLASSES("Sunglasses"),
    BACKPACK("Backpack"),
    UMBRELLA("Umbrella"),
    SNEAKERS("Sneakers"),
    WATCH("Watch"),
    CAMERA("Camera"),
    SHAMPOO("Shampoo"),
    TOOTHPASTE("Toothpaste"),
    CHOCOLATE("Chocolate"),
    T_SHIRT("T-shirt");

    private final String name;

    Good(String name) {
        this.name = name;
    }

    public String getString() {
        return name;
    }
}
