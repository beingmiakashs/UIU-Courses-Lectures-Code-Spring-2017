package com.sa.OOPLab.SectionSE.LectureOne;

import java.util.Scanner;

/**
 * Created by akashs on 1/31/17.
 */
public class Solution {
    public static void main(String[] args) {

        int i=20;
        double d=152;
        float f;
        char ch;
        boolean flag;
        flag=true;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = findMax(x,y);
        System.out.println(res);
//
//        sc.nextLine();
//        String s1 = sc.nextLine();
//
//        System.out.println(s1+" "+x);
//
//        String s = "OOP Theory";
//        System.out.println(i+d+s);
//
//        System.out.print("Hello World");
    }

    static int findMax(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}















