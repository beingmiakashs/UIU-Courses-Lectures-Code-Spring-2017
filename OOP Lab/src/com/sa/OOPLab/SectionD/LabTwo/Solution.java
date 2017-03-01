package com.sa.OOPLab.SectionD.LabTwo;

/**
 * Created by akashs on 2/6/17.
 */
public class Solution {
    public static void main(String[] args) {

        int[] ar = new int[50];
        int[][] ar2 = new int[50][10];

        Box[] boxes = new Box[10];
        boxes[0] = new Box(1,10,20);
        boxes[5] = new Box(5,10,10);

        System.out.println(boxes[0].calArea());
        System.out.println(boxes[5].calArea());

        Box box1;
        box1 = new Box(1,1,1);
        
        //box1.init(10,10,10);
//        box1.widht = 15;
//        box1.height = 20;
//        box1.depth = 10;

        double area = box1.calArea();
        System.out.println(area);

        Box box2 = new Box(15,20,10);
        System.out.println(box2.calArea());
//        box2.widht = 15;
//        box2.height = 20;
//        box2.depth = 10;

        double area2 = box2.calArea();
        System.out.println(area2);

    }
}
