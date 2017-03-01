package com.sa.OOPTheory.SectionC.LectureSeven;

/**
 * Created by akashs on 2/20/17.
 */
public abstract class Shape {
    public double width;
    public double height;
    public double depth;

    public Shape() {
        width=1;
        height=1;
        depth=1;
    }

    public Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void printDetails(){
        System.out.println("Shape:"+width+" "+height+" "+depth);
    }

    public abstract double calArea();

}
