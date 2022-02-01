package com.company.enums;

import java.util.Scanner;

public enum Priority {
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    private static final Scanner SCANNER = new Scanner(System.in);
    private String name;

    Priority(String name) {
        this.name = name;
    }

    public static Priority getPriority() {
        System.out.println("Choose category: ");
        return Priority.valueOf(SCANNER.nextLine());
    }

    @Override
    public String toString() {
        return name;
    }
}
