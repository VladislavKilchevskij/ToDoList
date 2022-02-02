package com.company.data;

import com.company.enums.Category;
import com.company.exceptions.TaskNotFoundException;
import com.company.model.Task;
import com.company.util.InputOutputInformationUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class TaskDataBase {
    public static final String FILEPATH = "src/main/java/com/company/resources/DataBase.bin";
    private static final Scanner SCANNER = new Scanner(System.in);

    private TaskDataBase() {
    }

    private static List<Task> taskList = new ArrayList<>();

    public static void add(Task task) {
            if (taskList.stream().anyMatch(s -> s.getName().equals(task.getName()))) {
                System.out.println("Such task name already exists.");
            } else taskList.add(task);
    }

    public static void sortByPriority() {
        taskList.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void filterByCategory() {
        System.out.println("Input category: ");
        Category category = Category.inputCategory();
        taskList.stream()
                .filter(s -> s.getTaskCategory().equals(category))
                .forEach(System.out::println);
    }

    public static void printTasksNames() {
        taskList.stream()
                .map(Task::getName)
                .forEach(System.out::println);
    }

    public static void showTask() {
        System.out.print("Enter task's name: ");
        String taskName = SCANNER.nextLine();
        try {
            if (taskList.stream()
                    .noneMatch(s -> s.getName().equals(taskName))) throw new TaskNotFoundException();
        } catch (TaskNotFoundException t) {
            System.out.println(t.getMessage());
            showTask();
        }
        taskList.stream()
                .filter(s -> s.getName().equals(taskName))
                .forEach(System.out::println);
    }

    public static void printAllTasks() {
        System.out.println("----------------------TASKS----------------------");
        taskList.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
    }

    public static void saveTDB() {
        InputOutputInformationUtils.save(taskList, FILEPATH);
    }

    public static void loadTDB() {
        File file = new File(FILEPATH);
        if (file.length() != 0) {
            taskList = InputOutputInformationUtils.load(FILEPATH);
        }
    }
}