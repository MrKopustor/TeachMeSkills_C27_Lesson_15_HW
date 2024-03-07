package com.teachmeskills.lesson_15.hw.task_3.service;

import java.util.ArrayList;

import static com.teachmeskills.lesson_15.hw.task_3.util.ReceptionInputData.receptionInputData;

public class ServiceOutputRandomNumbers {
    public static void serviceOutputRandomNumbers() {
        ArrayList<Integer> randomNumber = new ArrayList(receptionInputData());

        for (int j = 0; j < receptionInputData(); j++) {
            randomNumber.add((int) (Math.random() * 1000));
        }

        for (Integer r : randomNumber) {
            System.out.println(r);
        }
    }
}
