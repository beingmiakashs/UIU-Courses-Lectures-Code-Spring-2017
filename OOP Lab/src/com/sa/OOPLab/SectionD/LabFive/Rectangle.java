package com.sa.OOPLab.SectionD.LabFive;

/**
 * Created by akashs on 2/27/17.
 */
public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height, 0);
    }

    @Override
    public double calArea() {
        return width*height;
    }
}
