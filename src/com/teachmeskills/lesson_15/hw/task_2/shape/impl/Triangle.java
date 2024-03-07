package com.teachmeskills.lesson_15.hw.task_2.shape.impl;

import com.teachmeskills.lesson_15.hw.task_2.shape.BaseShape;

/**
 * Create the Triangle class and inherit the BaseShape class
 * Create fields for the Triangle
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the bodies of the methods
 */

public class Triangle extends BaseShape {
    double s, p, sideA, sideB, sideC;

    public Triangle(String nameShape, double sideA, double sideB, double sideC) {
        super(nameShape);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeterShape() {
        p = sideA + sideB + sideC;
        return p;
    }

    public void info() {
        System.out.println("Perimeter Triangle -> " + getPerimeterShape());
    }
}
