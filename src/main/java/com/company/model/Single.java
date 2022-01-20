package com.company.model;

import com.company.enums.Category;
import com.company.enums.Priority;

import java.util.Objects;
import java.util.UUID;

public class Single extends Task {

    protected String time;

    public Single() {

    }

    public Single(UUID id, String name, Category category, Priority priority, String date, String time) {
        super(id, name, category, priority, date);
        this.time = time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean execute() {
        return super.execute();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Single single = (Single) o;
        return Objects.equals(time, single.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), time);
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
