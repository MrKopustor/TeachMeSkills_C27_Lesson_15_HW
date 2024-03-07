package com.teachmeskills.lesson_15.hw.task_1.util;

/**
 * Class Converter
 * contains method convertToInt
 * which converts string to int
 * If value != int -> Exception
 */
public class Converter {
    public static int convertToInt(String string) {

        int i = 0;
        System.out.println("String -> " + string);

        try {
            i = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            //todo logging Error
            System.out.println("[ERROR] -> Invalid String");
        } catch (Exception e) {
            //todo logging Error
            System.out.println("[ERROR] -> Undefined Error");
        }
        return i;
    }
}
