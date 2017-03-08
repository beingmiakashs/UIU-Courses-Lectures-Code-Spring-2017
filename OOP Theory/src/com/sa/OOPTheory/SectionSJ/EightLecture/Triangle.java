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
    public boolean equals(Object t3) {
        Triangle t2 = (Triangle)t3;
        if(this.width == t2.width && this.height==t2.height){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        //String res = super.toString();
        String res = "Triangle info: "+width+" "+height;
        return res;
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
