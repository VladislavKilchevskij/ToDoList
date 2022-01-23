package com.company.enums;

import java.util.Scanner;

public enum Category {
    WORK("Work"),
    ACTIVITIES("Activities"),
    EDUCATION("Education"),
    ENTERTAINMENT("Entertainment"),
    HEALTH("Health");

    private static final Scanner SCANNER = new Scanner(System.in);
    private String name;

    Category(String name) {
        this.name = name;
    }

    public static Category inputCategory() {
        try {
            return Category.valueOf(SCANNER.nextLine());
        } catch (IllegalArgumentException i) {
            System.out.println("Such category doesn't exist.");
            System.out.print("Enter category: ");
            return inputCategory();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

