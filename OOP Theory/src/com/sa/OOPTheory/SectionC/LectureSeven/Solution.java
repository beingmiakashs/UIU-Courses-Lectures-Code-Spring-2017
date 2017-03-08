package com.sa.OOPTheory.SectionC.LectureSeven;

/**
 * Created by akashs on 2/20/17.
 */
public class Solution extends Triangle {
    public Solution(double width, double height) {
        super(width, height);
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(10,10);
        Triangle triangle2 = new Triangle(20,5);
        System.out.println(triangle1);
        if(triangle1.equals(triangle2)){
            System.out.println("Same triangle contents");
        }
        else{
            System.out.println("Different triangle contents");
        }

        String s1 = "abc";
        String s2 = "abc";

        if(s2.equals(s1)){
            System.out.println("String contents are same");
        }

//
//        Shape sh = new Triangle(10,5);
//        sh.printDetails();
//        System.out.println(sh.calArea());
//
//        Class c = sh.getClass();
//        System.out.println(c.getName());
//        System.out.println(sh);
//
//        if(sh instanceof Triangle){
//            System.out.println("sh points to Triangle object");
//        }
//
//
//        //Rectangle rectangle = new Rectangle(5,10,10);
//        sh = new Rectangle(5,10,10);
//        sh.printDetails();
//        System.out.println(sh.calArea());

    }
}





