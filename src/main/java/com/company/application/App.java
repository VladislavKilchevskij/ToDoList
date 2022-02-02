package com.company.application;

import com.company.data.TaskDataBase;
import com.company.data.UserDataBase;
import com.company.users.User;
import com.company.util.TaskOptionsUtils;

public class App {

    public static void main(String[] args) {

//   Наполнение базы данных пользователей самими пользователями
//        final Scanner SCANNER = new Scanner(System.in);
//
//        User<String> userTest = new User.Builder<String>()
//                .withFirstName(SCANNER.nextLine())
//                .withLastName(SCANNER.nextLine())
//                .withId(SCANNER.nextLine())
//                .create();
//        UserDataBase.add(userTest);
//        UserDataBase.printInfo();
//
//        User<Integer> userTest2 = new User.Builder<Integer>()
//                .withFirstName(SCANNER.nextLine())
//                .withLastName(SCANNER.nextLine())
//                .withId(SCANNER.nextInt())
//                .create();
//        UserDataBase.add(userTest2);
//        UserDataBase.printInfo();

//   Наполнение базы данных пользователей для теста
        User<String> userTest = new User.Builder<String>()
                .withFirstName("Vladislav")
                .withLastName("Smirnov")
                .withId("vlad123")
                .create();
        UserDataBase.add(userTest);

        User<Integer> userTest2 = new User.Builder<Integer>()
                .withFirstName("Andrei")
                .withLastName("Ivanov")
                .withId(123)
                .create();
        UserDataBase.add(userTest2);
        UserDataBase.printInfo();

        TaskDataBase.loadTDB();

        TaskOptionsUtils.openTaskCreatorsMenu();


//        TaskDataBase.printAllTasks();
//        TaskDataBase.sortByPriority();
//        TaskDataBase.filterByCategory();
//        TaskDataBase.printTasksNames();
//        TaskDataBase.showTask();


    }
}

