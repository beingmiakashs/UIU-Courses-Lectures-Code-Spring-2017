package com.sa.OOPTheory.SectionSJ.EightLecture;

/**
 * Created by akashs on 2/26/17.
 */
public class Cube extends Shape {
    public Cube(double width, double height, double depth) {
        super(width, height, depth);
    }

    @Override
    public double calArea() {
        return width*height*depth                   ;
    }
}
