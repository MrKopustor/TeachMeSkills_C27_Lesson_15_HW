package com.teachmeskills.lesson_15.hw.task_3.util;

import java.util.Scanner;

import static com.teachmeskills.lesson_15.hw.task_3.util.convert.convertToInt;

public class ReceptionInputData {
    public static int dataReception() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 - 100");
        String string = scanner.nextLine();
        int size = convertToInt(string);

        return size;
    }

}
