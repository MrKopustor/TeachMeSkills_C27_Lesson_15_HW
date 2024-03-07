package com.teachmeskills.lesson_15.hw.task_2.factory;

import com.teachmeskills.lesson_15.hw.task_2.shape.BaseShape;
import com.teachmeskills.lesson_15.hw.task_2.shape.impl.*;

/**
 * Class FactoryShape
 * Create objects class BaseShape
 */
public class FactoryShape {

    public static BaseShape[] fabricShape() {
        BaseShape circle = new Circle("Circle", 22.0);
        BaseShape hexagon = new Hexagon("Hexagon", 5.0);
        BaseShape rectangle = new Rectangle("Rectangle", 3.4, 6.0);
        BaseShape square = new Square("Square", 5.0);
        BaseShape triangle = new Triangle("Triangle", 7.0, 9.0, 2.5);

        BaseShape[] arr = {circle, hexagon, rectangle, square, triangle};
        return arr;
    }
}
