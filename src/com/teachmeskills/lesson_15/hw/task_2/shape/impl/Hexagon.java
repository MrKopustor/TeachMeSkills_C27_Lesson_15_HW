package com.teachmeskills.lesson_15.hw.task_2.shape.impl;

import com.teachmeskills.lesson_15.hw.task_2.shape.BaseShape;

/**
 * Create the Hexagon class and inherit the BaseShape class
 * Create fields for the Hexagon
 * Create constructor
 * Inherit methods getPerimeterShape, getFigureShape and info
 * Fill in the bodies of the methods
 */

public class Hexagon extends BaseShape {
    double p, s, side;

    public Hexagon(String nameShape, double side) {
        super(nameShape);
        this.side = side;
    }

    @Override
    public double getPerimeterShape() {
        p = 6 * side;
        return p;
    }

    public void info() {
        System.out.println("Perimeter Hexagon -> " + getPerimeterShape());
    }
}
