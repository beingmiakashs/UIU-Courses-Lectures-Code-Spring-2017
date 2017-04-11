package com.sa.OOPTheory.SectionC.LectureThirteen;

import java.util.Scanner;

/**
 * Created by akashs on 3/20/17.
 */
public class Solution {

    public static int fun(int a, int b) throws OddEvenException,ArithmeticException
    {
        try {
            if (b == 0) {
                ArithmeticException e = new ArithmeticException("You entere a zero as denominator");
                throw e;
            }
            if(b==1){
                OddEvenException e = new OddEvenException();
                throw e;
            }
        }catch (ArithmeticException e){

        }

        int res = a/b;
        return res;
    }

    public static void checkOD(int a) throws OddEvenException {
        if(a%2==0){
            throw new OddEvenException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] ar = new int[5];

        try {
            checkOD(a);
            System.out.println("Odd");
        } catch (OddEvenException e) {
            System.out.println("Even");
        }

        try {
            fun(a,b);
        } catch (OddEvenException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }

        int res=0;
        try {
            try {
            //res = a / b;

            System.out.println(res);

                ar[a] = res;
            }
            catch (IndexOutOfBoundsException e){
                //System.out.println("input value is not valid.");
                System.out.println(e.getMessage());
            }
            System.out.println("First try block");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index value is not appropriate.");
        }
//        catch (ArithmeticException ex){
//            System.out.println("You enter invalid number.");
//
//            System.out.println(ex.getMessage());
//            System.out.println(ex);
//            //res=0;
//        }
//        catch (Exception e){
//            System.out.println("Exception occured");
//        }

        finally {
            System.out.println("Result is "+res);
        }


        System.out.println("Program execution complete");

    }
}
