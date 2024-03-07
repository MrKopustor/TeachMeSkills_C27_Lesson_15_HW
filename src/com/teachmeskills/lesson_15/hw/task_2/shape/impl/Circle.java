package com.teachmeskills.lesson_15.hw.task_2.shape.impl;

import com.teachmeskills.lesson_15.hw.task_2.shape.BaseShape;

/**
 * Create the Circle class and inherit the BaseShape class
 * Create fields for the circle
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the bodies of the methods
 */

public class Circle extends BaseShape {
    double pi = 3.14, radius, p, s;

    public Circle(String nameShape, double radius) {
        super(nameShape);
        this.radius = radius;
    }

    @Override
    public double getPerimeterShape() {
        p = 2 * pi * radius;
        return p;
    }

    public void info() {
        System.out.println("Perimeter Circle -> " + getPerimeterShape());
    }
}
