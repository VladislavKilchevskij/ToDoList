package com.company.util;

import com.company.data.TaskDataBase;
import com.company.model.Ongoing;
import com.company.model.Repeatable;
import com.company.model.Single;

import java.util.Scanner;

public class TaskOptionsUtils {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String MENU = "Choose number of option:" + "\r\n"
            + "1.Single task" + "\r\n"
            + "2.Repeatable task" + "\r\n"
            + "3.Ongoing task" + "\r\n";

    private TaskOptionsUtils() {
    }

    public static void openTaskCreatorsMenu() {
        System.out.println(MENU);
        TaskOptionsUtils.selectOption();
        TaskOptionsUtils.askForContinue();
    }

    private static void selectOption() {
        switch (SCANNER.nextInt()) {
            case 1:
                Single singleTask = new SingleTaskCreator().create();
                TaskDataBase.add(singleTask);
                break;
            case 2:
                Repeatable repeatTask = new RepeatableTaskCreator().create();
                TaskDataBase.add(repeatTask);
                break;
            case 3:
                Ongoing ongTask = new OngoingTaskCreator().create();
                TaskDataBase.add(ongTask);
                break;
            default:
                System.out.println("Such option doesn't exist.");
                selectOption();
        }
    }

    private static void askForContinue() {
        System.out.println("Do you want to continue?" + "\r\n"
                + "1.Yes" + "\r\n"
                + "2.No");
        switch (SCANNER.nextInt()) {
            case 1:
                TaskOptionsUtils.selectOption();
                break;
            default:
                TaskDataBase.saveTDB();

        }
    }
}