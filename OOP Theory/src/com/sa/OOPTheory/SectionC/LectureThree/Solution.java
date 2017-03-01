package com.sa.OOPTheory.SectionC.LectureThree;

/**
 * Created by akashs on 2/8/17.
 */
public class Solution {
    static int a=10;
    private static void fun(int a1){
        a1+=10;
        a = a1;
    }

    public static void modify(Box box){
        box.setWidth(10);
        box.setDepth(15);
        box.setHeight(20);
    }

    public static void main(String[] args) {

        final double c = 15.25;
        // c = 10.23;

        int b = a;
        b+=10;
        //Solution s = new Solution();
        //s.fun(a);
//        System.out.println("Before modification: "+a);
//        fun(a);
//        System.out.println("After modification: "+a);
        Box box1 = new Box(5,10,5);
        System.out.println("Before modification: ");
        box1.printDetails();
        Box box3;
        box3 = box1;
        modify(box1);
        System.out.println("After modification: ");
        box1.printDetails();


        //box1 = new Box(15,10,"hello");
        //box1.setWidth(15);
//        box1.init(10,1,5);
//        box1.width = 10;
//        box1.height = 15;
//        box1.depth = 5;

        double area1 = box1.calArea();
        System.out.println(area1);

        Box box2 = new Box(10,15,5);
        System.out.println(box2.calArea());
//        box2.width = 10;
//        box2.height = 15;
//        box2.depth = 5;

        double area2 = box2.calArea();
        System.out.println(area2);
    }
}
