package com.teachmeskills.lesson_15.hw.task_4.launcher;

import java.util.LinkedHashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {

        Set<String> name = new LinkedHashSet<>();

        name.add("Andrew");
        name.add("Artem");
        name.add("Alina");
        name.add("Anastasia");
        name.add("Artem");
        name.add("Nikita");
        name.add("Oleg");
        name.add("Ivan");
        name.add("Cyril");
        name.add("Ruslan");
        name.add("Eugene");
        name.add("Paul");
        name.add("Ruslan");
        name.add("Ruslan");
        name.add("Alexander");
        name.add("Daniel");
        name.add("Alexei");
        name.add("Vladislav");

        System.out.println("List of unique names: \n");
        for (String n : name) {
            System.out.println(n);
        }
    }
}
