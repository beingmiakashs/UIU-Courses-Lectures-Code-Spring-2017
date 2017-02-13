package com.sa.OOPTheory.SectionC.LectureOne;

import java.util.Scanner;

/**
 * Created by akashs on 1/30/17.
 */
public class Solution {
    public static void main(String[] args) {

        int i,a=10;
        double d=10.5;
        float f;
        char ch;
        boolean b;
        b=true;
        String s1="OOP ";

        String s2=d+"";

        System.out.println("Hello World");
        System.out.println(a+" "+d);

        Scanner sc = new Scanner(System.in);

        double[] ar = new double[100];
        double[][] ar2 = new double[100][50];

        int n = sc.nextInt();
        for(i=0;i<n;i++){
            ar[i] = sc.nextDouble();
        }

        i=0;
        for(double dr : ar){
            System.out.println(dr);
            if(i>n)break;
            i++;
        }

//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//
//        if(n1<n2){
//            System.out.println(n1);
//        }
//        else{
//            System.out.println(n2);
//        }

        //sc.nextLine();
        //d = sc.nextDouble();
//        sc.nextLine();
//
//        s1 = sc.next();
//        sc.nextLine();
//        s2 = sc.nextLine();
//
//        System.out.println(n+" "+s1+" "+s2);

    }
}


















