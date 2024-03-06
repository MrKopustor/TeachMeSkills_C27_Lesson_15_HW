package com.teachmeskills.lesson_15.hw.task_1.util;

import java.util.ArrayList;
import java.util.Scanner;

import static com.teachmeskills.lesson_15.hw.task_1.util.Converter.convertToInt;

/**
 * Class ReceptionInputData
 * Contains method receptionInputData
 * Which
 */
public class ReceptionInputData {
    public static void receptionInputData() {

        String str;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList(); //16

        while (true) {
            System.out.println("Enter string");
            str = scanner.nextLine();

            if (str.equalsIgnoreCase("exit")) {
                break;
            }

            number.add(convertToInt(str));
        }

        for (int s : number) {
            if (s % 2 == 0) {
                System.out.println(s);
            } else {
                System.out.println("No even numbers");
            }
        }

        scanner.close();
    }
}
