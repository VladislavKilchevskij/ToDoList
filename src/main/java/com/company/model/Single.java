package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import java.util.UUID;

public class Single extends Task {

    protected LocalTime time;

    public Single() {

    }

    public Single(UUID id, String name, Category taskCategory, Priority taskPriority, LocalDate date, LocalTime time) {
        super(id, name, taskCategory, taskPriority, date);
        this.time = time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean execute() {
        return super.execute();
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
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "--------Single task--------" + "\r\n"
                + super.toString() + "\r\n"
                + "Time: " + time + "\r\n";
    }

}
