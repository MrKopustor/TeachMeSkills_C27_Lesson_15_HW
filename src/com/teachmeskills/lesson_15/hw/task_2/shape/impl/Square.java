package com.teachmeskills.lesson_15.hw.task_2.shape.impl;

import com.teachmeskills.lesson_15.hw.task_2.shape.BaseShape;

/**
 * Create the Square class and inherit the BaseShape class
 * Create fields for the Square
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the bodies of the methods
 */

public class Square extends BaseShape {
    double s, p, side;

    public Square(String nameShape, double side) {
        super(nameShape);
        this.side = side;
    }

    @Override
    public double getPerimeterShape() {
        p = 4 * side;
        return p;
    }

    public void info() {
        System.out.println("Perimeter Square -> " + getPerimeterShape());
    }
}
