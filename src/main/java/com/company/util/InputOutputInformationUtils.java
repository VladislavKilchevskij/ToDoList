package com.company.util;

import com.company.model.Task;
import lombok.experimental.UtilityClass;

import java.io.*;
import java.util.Collections;
import java.util.List;

@UtilityClass
public class InputOutputInformationUtils {

    public static void save(List<Task> list, String filepath) {
        try (FileOutputStream fos = new FileOutputStream(filepath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Task> load(String filepath) {
        try (FileInputStream fis = new FileInputStream(filepath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (List<Task>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
