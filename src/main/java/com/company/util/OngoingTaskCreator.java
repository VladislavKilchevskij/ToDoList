package com.company.util;

import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Ongoing;

import java.util.Scanner;
import java.util.UUID;

public class OngoingTaskCreator {

    private final Scanner SCANNER = new Scanner(System.in);

    public Ongoing create() {
        Ongoing ongoingTask = new Ongoing();
        ongoingTask.setId(UUID.randomUUID());
        ongoingTask.setName(getNameFromUser());
        ongoingTask.setTaskCategory(getCategoryFromUser());
        ongoingTask.setTaskPriority(getPriorityFromUser());
        ongoingTask.setDate(getDateFromUser());
        ongoingTask.setEndDate(getEndDateFromUser());
        return ongoingTask;
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

    private String getEndDateFromUser() {
        System.out.println("Deadline date: ");
        return SCANNER.nextLine();
    }
}
