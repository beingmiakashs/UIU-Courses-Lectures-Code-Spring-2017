package com.sa.OOPTheory.SectionSJ.EightLecture;

/**
 * Created by akashs on 2/26/17.
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

//    public double calArea(){
//        return width*height*depth;
//    }
    public abstract double calArea();

    public void printDetails(){
        if(depth==-1){
            System.out.println("Shape:"+width+" "+height);
        }
        else {
            System.out.println("Shape:"+width + " " + height + " " + depth);
        }
    }
}




