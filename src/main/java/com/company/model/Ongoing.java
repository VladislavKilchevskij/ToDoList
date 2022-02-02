package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class Ongoing extends Task {

    protected LocalDate endDate;
    protected Period untillDeadline;

    public Ongoing() {

    }

    public Ongoing(UUID id, String name, Category taskCategory, Priority taskPriority, LocalDate date, LocalDate endDate, Period untillDeadline) {
        super(id, name, taskCategory, taskPriority, date);
        this.endDate = endDate;
        this.untillDeadline = untillDeadline;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void beforeDeadline() {
        untillDeadline = Period.between(LocalDate.now(), endDate);
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
        return "-----Ongoing task-----" + "\r\n"
                + super.toString() + "\r\n"
                + "Deadline date: " + endDate + "\r\n"
                + "Deadline in: " + untillDeadline.getMonths() + " month(s) "
                + untillDeadline.getDays() + " day(s)." + "\r\n";
    }
}


