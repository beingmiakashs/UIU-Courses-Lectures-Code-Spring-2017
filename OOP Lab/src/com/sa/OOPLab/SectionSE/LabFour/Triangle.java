package com.sa.OOPLab.SectionSE.LabFour;

/**
 * Created by akashs on 2/28/17.
 */
public class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height, -1);
    }

    @Override
    public void printDetails() {
        System.out.println("Triangle: "+width+" "+height);
    }
}
