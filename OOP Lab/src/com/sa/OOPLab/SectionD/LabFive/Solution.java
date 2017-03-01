package com.sa.OOPLab.SectionD.LabFive;

/**
 * Created by akashs on 2/27/17.
 */
public class Solution {
    public static void main(String[] args) {
        Triangle tri = new Triangle(10,5);
        Shape sh;
        sh = tri;
        //sh = new Rectangle(10,5);
        //tri = (Triangle) sh;
        sh.printDetails();
        System.out.println(sh.calArea());

        //Rectangle rec = new Rectangle(10,5);
        sh = new Rectangle(10,5);
        sh.printDetails();
        System.out.println(sh.calArea());


        Shape[] shapes = new Shape[10];
        shapes[0] = new Triangle(10,20);
        shapes[1] = new Rectangle(10,5);
        shapes[2] = new Triangle(10,30);
        shapes[3] = new Triangle(20,10);
        shapes[4] = new Rectangle(100,10);
        shapes[5] = new Rectangle(100,5);

        shapes[0].printDetails();
        System.out.println(shapes[0].calArea());

        shapes[1].printDetails();

    }
}





