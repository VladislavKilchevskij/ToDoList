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

    public static Category getCategory() {
        System.out.println("Choose category: ");
        return Category.valueOf(SCANNER.nextLine());
    }

    @Override
    public String toString() {
        return name;
    }
}

