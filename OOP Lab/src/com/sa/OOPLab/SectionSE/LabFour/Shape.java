package com.sa.OOPLab.SectionSE.LabFour;

/**
 * Created by akashs on 2/28/17.
 */
public abstract class Shape {
    public double width;
    public double height;
    public double depth;

    public abstract double calArea();

//    public Shape(){
//
//    }

    public Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void printDetails(){
        System.out.println("Shape: "+width+" "+height+" "+depth);
    }
}
