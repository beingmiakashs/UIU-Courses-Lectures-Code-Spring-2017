package com.sa.OOPLab.SectionD.LabTwo;

/**
 * Created by akashs on 2/6/17.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

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

    public void init(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public double calArea(){
        double area = width *height*depth;
        return area;
    }
}
