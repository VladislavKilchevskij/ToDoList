package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;

import java.util.Objects;
import java.util.UUID;

public class Ongoing extends Task {

    protected String endDate;

    public Ongoing() {

    }

    public Ongoing(UUID id, String name, Category category, Priority priority, String date, String endDate) {
        super(id, name, category, priority, date);
        this.endDate = endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
        Ongoing ongoing = (Ongoing) o;
        return endDate.equals(ongoing.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), endDate);
    }

    @Override
    public String toString() {
        return "-----Ongoing task-----" + "\r\n"
                + super.toString() + "\r\n"
                + "Deadline date: " + endDate + "\r\n";
    }
}


