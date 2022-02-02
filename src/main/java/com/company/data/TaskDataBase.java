package com.company.data;

import com.company.enums.Category;
import com.company.exceptions.TaskNotFoundException;
import com.company.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class TaskDataBase {

    private static final Scanner SCANNER = new Scanner(System.in);

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
        System.out.println("Input category: ");
        Category category = Category.inputCategory();
        TASKS.stream()
                .filter(s -> s.getTaskCategory().equals(category))
                .forEach(System.out::println);
    }

    public static void printTasksNames() {
        TASKS.stream()
                .map(Task::getName)
                .forEach(System.out::println);
    }

    public static void showTask() {
        System.out.print("Enter task's name: ");
        String taskName = SCANNER.nextLine();
        try {
            if (TASKS.stream()
                    .noneMatch(s -> s.getName().equals(taskName))) throw new TaskNotFoundException();
        } catch (TaskNotFoundException t) {
            System.out.println(t.getMessage());
            showTask();
        }
        TASKS.stream()
                .filter(s -> s.getName().equals(taskName))
                .forEach(System.out::println);

    }

    public static void printAllTasks() {
        System.out.println("----------------------TASKS----------------------");
        TASKS.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
    }
}
