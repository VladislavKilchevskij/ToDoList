package com.company.data;

import com.company.enums.Category;
import com.company.model.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TaskDataBase {

    private TaskDataBase() {
    }

    private static List<Task> TASKS = new ArrayList<Task>() {
    };

    public static void add(Task task) {
        if (TASKS.stream().anyMatch(s -> s.getName().equals(task.getName()))) {
            System.out.println("Such task name already exists.");
        }
        TASKS.add(task);
    }

    public static void sorted() {
        TASKS.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void filterByCategory() {
        Category category = Category.getCategory();
        TASKS.stream()
                .filter(s -> s.getTaskCategory().equals(category))
                .forEach(System.out::println);
    }

    public static void printTasksNames() {
        TASKS.stream()
                .map(s -> s.getName())
                .forEach(System.out::println);
    }

    public static void printInfo() {
        System.out.println("----------------------TASKS----------------------");
        TASKS.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
    }
}
