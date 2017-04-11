package com.sa.OOPLab.SectionSE.LabTen;

/**
 * Created by akashs on 4/11/17.
 */
public class Solution {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);

        MyThread myThread1 = new MyThread("MT1", 10);
        //MyThread myThread2 = new MyThread("MT2");
        //ThreadRunnable thR = new ThreadRunnable("THR1");

        myThread1.start();
        //myThread2.start();
        //thR.th.start();

        try {

            myThread1.join();
            //myThread2.join();
            //thR.th.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("End main thread");

    }
}








