package com.sa.OOPLab.SectionD.LabFive;

/**
 * Created by akashs on 2/27/17.
 */
public class Triangle extends Shape{
    public Triangle(double width, double height) {
        super(width, height, -1);
    }

    public void printDetails(){
        System.out.println("Triangle:"+width+" "+height);
    }

    public double calArea(){
        return 0.5*width*height;
    }
}
