package com.sa.OOPTheory.SectionSJ.EightLecture;

/**
 * Created by akashs on 2/20/17.
 */
public class Rectangle extends Shape {
    public Rectangle(double width, double height, double depth) {
        super(width, height, depth);
    }

    public double calArea(){
        double area = width*height;
        return area;
    }
}
