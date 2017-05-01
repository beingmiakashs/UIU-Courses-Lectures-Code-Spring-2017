package com.sa.OOPTheory.SectionC.LectureNineteen;

/**
 * Created by akashs on 4/17/17.
 */
public class Solution {
    public static void main(String[] args) {

//        Thread mainThread = Thread.currentThread();
//        mainThread.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(mainThread);
//        System.out.println(mainThread.getName());

        Counter counter = new Counter();
        counter.total=0;

        MyThread myThread1= new MyThread("OEC1",0,100,counter);
        MyThread myThread2= new MyThread("OEC2",101,200,counter);

//        myThread1.run();

        myThread1.start();
        myThread2.start();

        ThreadRunnable thR = new ThreadRunnable();
        thR.th.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main thread excution complete");

    }
}

