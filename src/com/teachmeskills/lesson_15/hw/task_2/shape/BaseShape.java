package com.teachmeskills.lesson_15.hw.task_2.shape;

/**
 * Create abstract class BaseShape
 * Create the Shape Name field
 * Create a constructor with the Shape name field
 * Create abstract getPerimeterShape method to calculate Perimeters
 * Create abstract getFigureShape method to calculate the area of the shape
 * Create abstract info method to output information about shapes
 */
public abstract class BaseShape {

    public String nameShape;

    public BaseShape(String nameShape) {
        this.nameShape = nameShape;
    }

    public abstract double getPerimeterShape();

    public abstract void info();

}
