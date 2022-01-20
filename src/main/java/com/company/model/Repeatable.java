package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;

import java.time.DayOfWeek;
import java.util.Objects;
import java.util.UUID;

public class Repeatable extends Task {
    protected DayOfWeek dayOfWeek;

    public Repeatable() {

    }

    public Repeatable(UUID id, String name, Category category, Priority priority, String date, DayOfWeek dayOfWeek) {
        super(id, name, category, priority, date);
        this.dayOfWeek = dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean execute() {
        return super.execute();
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Repeatable that = (Repeatable) o;
        return dayOfWeek == that.dayOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dayOfWeek);
    }

    @Override
    public String toString() {
        return "----Repeatable task----" + "\r\n"
                + super.toString() + "\r\n"
                + "Repaet on: " + dayOfWeek + "\r\n";
    }

}
