package com.sa.OOPLab.SectionSE.LabTwo;

/**
 * Created by akashs on 2/7/17.
 */
public class Solution {

    public static void main(String[] args) {

        int[] ar = new int[10];
        int[][] ar2 = new int[10][5];

        Integer in = new Integer(10);
        int num = Integer.parseInt("512478");

        Box[] boxes = new Box[10];
        boxes[0] = new Box();
        boxes[5] = new Box(2,2,5);

        System.out.println(boxes[0].calArea());
        System.out.println(boxes[5].calArea());

        Box box1 = new Box(10,15,10);
//        box1.init(10,15,10);
//        box1.width = 10;
//        box1.height = 15;
//        box1.depth = 10;

        double area1 = box1.calArea();
        System.out.println(area1);

        Box box2 = new Box(5,5,10);
        System.out.println(box2.calArea());
//        box2.width = 5;
//        box2.height = 5;
//        box2.depth = 10;

        double area2 = box2.calArea();
        System.out.println(area2);
    }


}





