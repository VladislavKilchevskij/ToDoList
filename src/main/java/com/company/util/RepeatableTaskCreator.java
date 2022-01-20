package com.company.util;

import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Repeatable;
import lombok.experimental.UtilityClass;

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
        return Category.valueOf(SCANNER.nextLine());
    }

    private Priority getPriorityFromUser() {
        System.out.println("Priority: ");
        return Priority.valueOf(SCANNER.nextLine());
    }

    private String getDateFromUser() {
        System.out.println("Date: ");
        return SCANNER.nextLine();
    }

    private DayOfWeek getDayOfWeekFromUser() {
        System.out.println("Repeat every: ");
        return DayOfWeek.valueOf(SCANNER.nextLine());
    }
}
