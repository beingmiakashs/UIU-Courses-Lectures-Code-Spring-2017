package com.sa.OOPTheory.SectionSJ.EightLecture;

/**
 * Created by akashs on 2/20/17.
 */
public class Solution {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,5);
        Triangle triangle2 = new Triangle(10,50);
        Shape sh;
        sh = triangle;
        sh.printDetails();
        System.out.println(sh.calArea());
        System.out.println(triangle);

        String s1="abc";
        String s2="abc";
        if(triangle.equals(triangle2)){
            System.out.println("Equal");
        }

        Class c = triangle.getClass();
        System.out.println(c.getName());

        if(sh instanceof Rectangle){
            System.out.println("Sh now point to triangle");
        }

//        Shape sh1 = new Shape();
//        triangle = sh1;

        Rectangle rectangle = new Rectangle(5,10,-1);
        sh = rectangle;
        sh.printDetails();
        System.out.println(sh.calArea());

    }
}
