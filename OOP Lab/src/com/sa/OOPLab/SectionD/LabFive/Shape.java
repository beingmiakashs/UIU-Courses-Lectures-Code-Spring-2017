package com.sa.OOPLab.SectionD.LabFive;

/**
 * Created by akashs on 2/27/17.
 */
public abstract class Shape {
    public double width;
    public double height;
    public double depth;

    public Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public abstract double calArea();

    public void printDetails(){
        System.out.println("Shape:"+width+" "+height+" "+depth);
    }
}


