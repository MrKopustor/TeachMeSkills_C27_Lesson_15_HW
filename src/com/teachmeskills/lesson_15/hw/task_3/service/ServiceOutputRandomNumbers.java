package com.teachmeskills.lesson_15.hw.task_3.service;

import java.util.ArrayList;

public class ServiceOutputRandomNumbers {
    public static void serviceOutputRandomNumbers(int size) {
        int arithmeticMean;
        int count = 0;

        ArrayList<Integer> randomNumber = new ArrayList(size);

        for (int j = 0; j < size; j++) {
            randomNumber.add((int) (Math.random() * 1000));
        }

        for (Integer r : randomNumber) {
            count += r;
        }

        if(count != 0){
            arithmeticMean = count / size;
            System.out.println("Arithmetic mean of all elements collection -> " + arithmeticMean);
        }
    }
}
