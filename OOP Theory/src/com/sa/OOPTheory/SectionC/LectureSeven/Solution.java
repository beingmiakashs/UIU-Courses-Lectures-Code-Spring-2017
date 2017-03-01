package com.sa.OOPTheory.SectionC.LectureSeven;

/**
 * Created by akashs on 2/20/17.
 */
public class Solution {
    public static void main(String[] args) {
        //Triangle triangle = new Triangle(10,5,10);
        Shape sh = new Triangle(10,5);
        sh.printDetails();
        System.out.println(sh.calArea());

        Class c = sh.getClass();
        System.out.println(c.getName());
        System.out.println(sh);

        if(sh instanceof Triangle){
            System.out.println("sh points to Triangle object");
        }


        //Rectangle rectangle = new Rectangle(5,10,10);
        sh = new Rectangle(5,10,10);
        sh.printDetails();
        System.out.println(sh.calArea());

    }
}





