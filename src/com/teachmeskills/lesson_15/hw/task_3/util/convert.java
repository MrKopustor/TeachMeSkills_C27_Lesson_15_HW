package com.teachmeskills.lesson_15.hw.task_3.util;

public class convert {

    public static int convertToInt(String string) {
        int sizeArrayList = 0;
        System.out.println("String -> " + string);

        try {
            sizeArrayList = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            //todo logging Error
            System.out.println("[ERROR] -> Invalid String");
        } catch (Exception e) {
            //todo logging Error
            System.out.println("[ERROR] -> Undefined Error");
        }

        return sizeArrayList;
    }
}
