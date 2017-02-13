package com.sa.OOPTheory.SectionSJ.LectureThree;

/**
 * Created by akashs on 2/5/17.
 */
public class Solution {
    public static void main(String[] args) {

        int[] ar = new int[10];
        int[][] ar2 = new int[10][];

        ar2[0] = new int[10];
        ar2[1] = new int[100];
        ar2[2] = new int[2];

        for(int num: ar2[0]){
            System.out.println(num);
        }


        Box box1 = new Box(1,1,(int)1);
        box1.setWidth(15);
        double tmWidth = box1.getWidth();
//        box1.width=5;
//        box1.height=10;
//        box1.depth=10;
        //box1.init(5,10,10);

        Box box2 = new Box(15,20,10);
//        box2.width=15;
//        box2.height=20;
//        box2.depth=10;

        double area = box1.calArea("box1");
        System.out.println(area);
        System.out.println(box2.calArea("box2"));
    }
}
