package com.teachmeskills.lesson_15.hw.task_2.shape.impl;

import com.teachmeskills.lesson_15.hw.task_2.shape.BaseShape;

/**
 * Create the Rectangle class and inherit the BaseShape class
 * Create fields for the Rectangle
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the bodies of the methods
 */

public class Rectangle extends BaseShape {

    double s, p, length, width;

    public Rectangle(String nameShape, double length, double width) {
        super(nameShape);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeterShape() {
        p = 2 * (width + length);
        return p;
    }

    public void info() {
        System.out.println("Perimeter Rectangle -> " + getPerimeterShape());
    }
}
