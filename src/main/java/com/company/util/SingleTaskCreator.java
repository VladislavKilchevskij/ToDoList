package com.company.util;

import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Single;
import com.company.model.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.UUID;

public class SingleTaskCreator {
    private final Scanner SCANNER = new Scanner(System.in);

    protected Single create() {
        Single singleTask = new Single();
        singleTask.setId(UUID.randomUUID());
        singleTask.setName(getNameFromUser());
        singleTask.setTaskCategory(getCategoryFromUser());
        singleTask.setTaskPriority(getPriorityFromUser());
        singleTask.setDate(getDateFromUser());
        singleTask.setTime(getTimeFromUser());
        return singleTask;
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

    private LocalTime getTimeFromUser() {
        System.out.print("Time: ");
        return LocalTime.parse(SCANNER.nextLine(), Task.TIME_PATTERN);
    }

}
