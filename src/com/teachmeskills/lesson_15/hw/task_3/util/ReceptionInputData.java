package com.teachmeskills.lesson_15.hw.task_3.util;

import java.util.Scanner;

public class ReceptionInputData {
    public static int receptionInputData() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size ArrayList");
        String str = scanner.nextLine();
        int sizeArrayList = 0;

        try {
            sizeArrayList = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            //todo logging Error
            System.out.println("[ERROR] -> Invalid String");
        } catch (Exception e) {
            //todo logging Error
            System.out.println("[ERROR] -> Undefined Error");
        }

        scanner.close();

        return sizeArrayList;
    }
}
