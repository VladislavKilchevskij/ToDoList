package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;

import java.util.Objects;
import java.util.UUID;

public abstract class Task implements Executable, Comparable {

    protected UUID id;
    protected String name;
    protected Category taskCategory;
    protected Priority taskPriority;
    protected String date;

    protected Task() {
    }

    protected Task(UUID id, String name, Category category, Priority priority, String date) {
        this.id = id;
        this.taskCategory = category;
        this.taskPriority = priority;
        this.name = name;
        this.date = date;
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

    public void setDate(String date) {
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public Category getTaskCategory() {
        return taskCategory;
    }

    public Priority getTaskPriority() {
        return taskPriority;
    }

    @Override
    public boolean isExecuted() {
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
                Objects.equals(name, task.name) &&
                taskCategory == task.taskCategory &&
                taskPriority == task.taskPriority &&
                Objects.equals(date, task.date);
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

