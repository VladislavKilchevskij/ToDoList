package com.company.util;

import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Single;
import lombok.experimental.UtilityClass;

import java.util.Scanner;
import java.util.UUID;

public class SingleTaskCreator {
    private final Scanner SCANNER = new Scanner(System.in);

    public Single create() {
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

    private String getTimeFromUser() {
        System.out.println("Time: ");
        return SCANNER.nextLine();
    }
}
