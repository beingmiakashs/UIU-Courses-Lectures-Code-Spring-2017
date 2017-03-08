package com.sa.OOPTheory.SectionC.LectureSeven;

/**
 * Created by akashs on 2/20/17.
 */
public class Triangle extends Shape implements ShapeFunc{

    @Override
    public boolean equals(Object obj) {

        Triangle triangle2 = (Triangle) obj;
        //if(this.width==triangle2.width && height==triangle2.height){
        if(calArea()==triangle2.calArea()){
            return true;
        }
        else{
            return false;
        }


    }

    @Override
    public String toString() {
        String res = "Triangle Info: "+width+" "+height;
        return res;
    }

    public Triangle(double width, double height) {
        super(width, height, 0);
    }

    public void printDetails(){
        System.out.println("Triangle:"+width+" "+height+" "+depth);
    }

    public double calArea(){
        double area = 0.5*width*height;
        return area;
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
    public void printShape(Shape shape) {

    }
}
