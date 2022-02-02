package com.company.util;

import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Ongoing;
import com.company.model.Task;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class OngoingTaskCreator {

    private final Scanner SCANNER = new Scanner(System.in);

    protected Ongoing create() {
        Ongoing ongoingTask = new Ongoing();
        ongoingTask.setId(UUID.randomUUID());
        ongoingTask.setName(getNameFromUser());
        ongoingTask.setTaskCategory(getCategoryFromUser());
        ongoingTask.setTaskPriority(getPriorityFromUser());
        ongoingTask.setDate(getDateFromUser());
        ongoingTask.setEndDate(getEndDateFromUser());
        ongoingTask.beforeDeadline();
        return ongoingTask;
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

    private LocalDate getEndDateFromUser() {
        System.out.print("Deadline date: ");
        return LocalDate.parse(SCANNER.nextLine(), Task.DATE_PATTERN);
    }

}
