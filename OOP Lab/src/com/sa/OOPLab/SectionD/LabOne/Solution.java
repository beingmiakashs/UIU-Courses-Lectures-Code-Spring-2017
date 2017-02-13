package com.sa.OOPLab.SectionD.LabOne;

import java.util.Scanner;

/**
 * Created by akashs on 1/30/17.
 */
public class Solution {
    int studentId;

    public static void main(String[] args) {

        int year=2017;
        double d=10;
        float f;
        char ch;
        boolean b;
        b=true;
        String s ="OPP Theory";

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = findMax(x,y);
        System.out.println(res);
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








