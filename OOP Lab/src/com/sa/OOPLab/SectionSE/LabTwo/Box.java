package com.sa.OOPLab.SectionSE.LabTwo;

/**
 * Created by akashs on 2/7/17.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(){
        width = 5;
        height = 5;
        depth = 5;
    }

    public double calArea(){
        double area = width * height * depth;
        return area;
    }

    public void init(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}












