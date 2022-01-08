package com.company.users;

public class User<T> implements Printable{
    private String firstName;
    private String lastName;
    private T id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public T getId() {
        return id;
    }

    public static class Builder<T> {
        private final User<T> newUser;

        public Builder() {
            newUser = new User<T>();
        }

        public Builder<T> withFirstName (String firstName) {
            newUser.firstName = firstName;
            return this;
        }

        public Builder<T> withLastName (String lastName) {
            newUser.lastName = lastName;
            return this;
        }

        public Builder<T> withId (T id) {
            newUser.id = id;
            return this;
        }

        public User<T> create () {
            return newUser;
        }

    }

    @Override
    public void print() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "------Account info------" + "\r\n"
                + "First name: " + firstName + "\r\n"
                + "Last name: " + lastName + "\r\n"
                + "Id: " + id + "\r\n";
    }
}
