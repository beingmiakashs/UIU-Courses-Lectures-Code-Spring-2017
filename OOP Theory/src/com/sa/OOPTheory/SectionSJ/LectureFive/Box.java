package com.sa.OOPTheory.SectionSJ.LectureFive;

/**
 * Created by akashs on 2/12/17.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public void printDetails(){
        System.out.println(width+" "+height+" "+depth);
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
