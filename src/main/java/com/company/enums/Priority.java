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

    public static Priority inputPriority() {
        try {
            return Priority.valueOf(SCANNER.nextLine());
        } catch (IllegalArgumentException i) {
            System.out.println("Such priority doesn't exist.");
            System.out.print("Enter priority: ");
            return inputPriority();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
