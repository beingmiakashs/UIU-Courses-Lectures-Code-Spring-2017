package com.sa.OOPTheory.SectionC;

/**
 * Created by akashs on 1/30/17.
 */
public class Main {

    public static int doWork(){
        try{
            return 10/0;
        }catch (Exception e){
            return 10/5;
        }
//        finally {
//            return 10/2;
//        }
    }

    public static void main(String[] args) {
        int num = doWork();
        System.out.println(num);
    }
}
