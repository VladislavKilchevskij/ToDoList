package com.company.util;

import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Repeatable;

import java.time.DayOfWeek;
import java.util.Scanner;
import java.util.UUID;

public class RepeatableTaskCreator {

    private final Scanner SCANNER = new Scanner(System.in);

    public Repeatable create() {
        Repeatable repeatableTask = new Repeatable();
        repeatableTask.setId(UUID.randomUUID());
        repeatableTask.setName(getNameFromUser());
        repeatableTask.setTaskCategory(getCategoryFromUser());
        repeatableTask.setTaskPriority(getPriorityFromUser());
        repeatableTask.setDate(getDateFromUser());
        repeatableTask.setDayOfWeek(getDayOfWeekFromUser());
        return repeatableTask;
    }

    private String getNameFromUser() {
        System.out.println("Name: ");
        return SCANNER.nextLine();
    }

    private Category getCategoryFromUser() {
        System.out.println("Category: ");
        return Category.inputCategory();
    }

    private Priority getPriorityFromUser() {
        System.out.println("Priority: ");
        return Priority.inputPriority();
    }

    private String getDateFromUser() {
        System.out.println("Date: ");
        return SCANNER.nextLine();
    }

    private DayOfWeek getDayOfWeekFromUser() {
        System.out.println("Repeat every: ");
        try {
            return DayOfWeek.valueOf(SCANNER.nextLine());
        } catch (IllegalArgumentException i) {
            System.out.println("Such day of week doesn't exist.");
            return getDayOfWeekFromUser();
        }
    }
}
