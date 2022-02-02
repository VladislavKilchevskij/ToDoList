package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public abstract class Task implements Executable, Comparable {
    public static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter TIME_PATTERN = DateTimeFormatter.ofPattern("HH:mm");

    protected UUID id;
    protected String name;
    protected Category taskCategory;
    protected Priority taskPriority;
    protected LocalDate date;

    protected Task() {
    }

    public Task(UUID id, String name, Category taskCategory, Priority taskPriority, LocalDate date) {
        this.id = id;
        this.name = name;
        this.taskCategory = taskCategory;
        this.taskPriority = taskPriority;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaskCategory(Category taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void setTaskPriority(Priority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getTaskCategory() {
        return taskCategory;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean execute() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        return this.taskPriority.compareTo(((Task) o).taskPriority);    // сортировка по приоритету в порядке убывания
    }

    @Override
    public String toString() {
        return "Task: " + name + "\r\n"
                + "Id: " + id + "\r\n"
                + "Category: " + taskCategory + "\r\n"
                + "Priority: " + taskPriority + "\r\n"
                + "Date: " + date;
    }
}

