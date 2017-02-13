package com.sa.OOPTheory.SectionSJ.LectureThree;

/**
 * Created by akashs on 2/5/17.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(){
        width = 10;
        height = 10;
        depth = 10;
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

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public Box(double width, double height) {
        System.out.println("integer constructor");
        this.width = width;
        this.height = height;
        this.depth = 10;
        this.calArea("box");
    }

    {
        width = 10;
        System.out.println("Initialization block");
    }


    public Box(double width, double height, double depth) {
        System.out.println("double constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void init(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public double calArea(String name){
        double area = width*height*depth;
        return area;
    }
}
