package com.teachmeskills.lesson_15.hw.task_3.launcher;

import static com.teachmeskills.lesson_15.hw.task_3.service.ServiceOutputRandomNumbers.serviceOutputRandomNumbers;
import static com.teachmeskills.lesson_15.hw.task_3.util.ReceptionInputData.dataReception;

public class Runner {
    public static void main(String[] args) {
        serviceOutputRandomNumbers(dataReception());
    }
}
