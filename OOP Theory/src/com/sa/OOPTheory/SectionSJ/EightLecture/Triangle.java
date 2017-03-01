package com.sa.OOPTheory.SectionSJ.EightLecture;

/**
 * Created by akashs on 2/20/17.
 */
public class Triangle extends Shape implements ShapeFunc {

    public Triangle(double width, double height) {
        super(width, height, -1);
    }

    public double calArea(){
        double area = 0.5*width*height;
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printDetails(){
        System.out.println("Triangle:"+width+" "+height);
    }

    @Override
    public double calAngle() {
        return 0;
    }

    @Override
    public double calDiagonal() {
        return 0;
    }

    @Override
    public void printShape(Shape sh) {

    }
}
