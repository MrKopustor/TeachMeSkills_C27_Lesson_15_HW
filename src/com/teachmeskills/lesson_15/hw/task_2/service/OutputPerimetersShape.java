package com.teachmeskills.lesson_15.hw.task_2.service;

import com.teachmeskills.lesson_15.hw.task_2.factory.FactoryShape;
import com.teachmeskills.lesson_15.hw.task_2.shape.BaseShape;

import java.util.ArrayList;

/**
 * Class OutputPerimetersShape
 * Has method outputPerimetersShape
 * Which contains ArrayList and calls objects method "info" the help of cycle
 */
public class OutputPerimetersShape {
    public static void outputPerimetersShape() {

        ArrayList<BaseShape> shapes = new ArrayList(4);

        for (int i = 0; i < FactoryShape.fabricShape().length; i++) {
            shapes.add(FactoryShape.fabricShape()[i]);
        }

        for (BaseShape s : shapes) {
            s.info();
        }
    }
}
