package com.company.data;

import com.company.model.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TaskDataBase {

    private TaskDataBase() {
    }

    private static List<Task> TASKS = new ArrayList<Task>() {
    };

    public static void sort() {
        Collections.sort(TASKS);
    }

    public static void add(Task task) {
        TASKS.add(task);
    }

    public static void printInfo() {
        System.out.println("----------------------TASKS----------------------");
        TASKS.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
    }
}