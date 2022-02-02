package com.company.util;

import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Repeatable;
import com.company.model.Task;

import java.time.DayOfWeek;
import java.time.LocalDate;
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
        System.out.print("Name: ");
        return SCANNER.nextLine();
    }

    private Category getCategoryFromUser() {
        System.out.print("Category: ");
        return Category.inputCategory();
    }

    private Priority getPriorityFromUser() {
        System.out.print("Priority: ");
        return Priority.inputPriority();
    }

    private LocalDate getDateFromUser() {
        System.out.print("Date: ");
        return LocalDate.parse(SCANNER.nextLine(), Task.DATE_PATTERN);
    }

    private DayOfWeek getDayOfWeekFromUser() {
        System.out.print("Repeat every: ");
        try {
            return DayOfWeek.valueOf(SCANNER.nextLine());
        } catch (IllegalArgumentException i) {
            System.out.println("Such day of week doesn't exist.");
            System.out.print("Enter day of week: ");
            return getDayOfWeekFromUser();
        }
    }
}
