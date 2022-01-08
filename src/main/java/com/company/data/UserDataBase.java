package com.company.data;

import com.company.users.User;

import java.util.ArrayList;
import java.util.List;

public final class UserDataBase {

    private UserDataBase() {
    }

    private static List<User> USERS = new ArrayList<User>() {
    };

    public static void add(User user) {
        USERS.add(user);
    }

    public static void printInfo() {
        System.out.println("----------------------USERS----------------------");
        USERS.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
    }
}