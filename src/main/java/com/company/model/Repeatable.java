package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.UUID;

public class Repeatable extends Task implements Serializable {
    protected DayOfWeek dayOfWeek;

    public Repeatable() {

    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
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
        return "----Repeatable task----" + "\r\n"
                + super.toString() + "\r\n"
                + "Repaet on: " + dayOfWeek + "\r\n";
    }

}
