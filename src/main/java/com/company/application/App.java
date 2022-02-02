package com.company.application;

import com.company.data.TaskDataBase;
import com.company.data.UserDataBase;
import com.company.enums.Category;
import com.company.enums.Priority;
import com.company.model.Ongoing;
import com.company.model.Repeatable;
import com.company.model.Single;
import com.company.users.User;

import java.time.DayOfWeek;
import java.util.UUID;

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


//   Наполнение базы данных задач пользователем
//        Single st = new SingleTaskCreator().create();
//        TaskDataBase.add(st);
//
//        Repeatable rt = new RepeatableTaskCreator().create();
//        TaskDataBase.add(rt);
//
//        Ongoing ot = new OngoingTaskCreator().create();
//        TaskDataBase.add(ot);
//
//        TaskDataBase.printInfo();


//   Наполнение базы данных задач для теста

        Single st1 = new Single(UUID.randomUUID()
                , "Visit doctor"
                , Category.HEALTH
                , Priority.HIGH
                , "01.01.2022"
                , "15:00");
        TaskDataBase.add(st1);

        Repeatable rt1 = new Repeatable(UUID.randomUUID()
                , "Go library"
                , Category.EDUCATION
                , Priority.LOW
                , "02.01.2022"
                , DayOfWeek.MONDAY);
        TaskDataBase.add(rt1);

        Ongoing ong1 = new Ongoing(UUID.randomUUID()
                , "Java project"
                , Category.WORK
                , Priority.MEDIUM
                , "03.01.2022"
                , "20.01.2022");
        TaskDataBase.add(ong1);

        TaskDataBase.printAllTasks();
        TaskDataBase.sorted();
        TaskDataBase.filterByCategory();
        TaskDataBase.printTasksNames();
        TaskDataBase.showTask();

    }
}

