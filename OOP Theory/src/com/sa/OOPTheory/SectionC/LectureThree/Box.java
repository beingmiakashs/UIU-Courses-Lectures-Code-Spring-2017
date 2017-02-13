package com.sa.OOPTheory.SectionC.LectureThree;

/**
 * Created by akashs on 2/8/17.
 */
public class Box {
    private double width;
    private double height;
    private double depth;
    static int a = 10;

    public void printDetails(){
        System.out.println(width+" "+height+" "+depth);
    }

    {
        width = 15;
        System.out.println("initialization block");
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

    public Box(){
        width = 1;
        height = 1;
        depth = 1;
    }

    public Box(double w, double h, double d){
        System.out.println("Constructor call");
        width = w;
        height = h;
        depth = d;
    }

    public Box(double w, double h, String d){
        width = w;
        height = h;
        depth = 5;
    }

    public void init(double w, double h, int d){
        width = w;
        height = h;
        depth = d;
    }

    public void init(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public double calArea(){
        double area = width*height*depth;
        return area;
    }
}
