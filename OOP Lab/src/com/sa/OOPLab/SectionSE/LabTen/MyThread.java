package com.sa.OOPLab.SectionSE.LabTen;

/**
 * Created by akashs on 4/11/17.
 */
public class MyThread extends Thread {

    private int startTime;

    public MyThread(String name, int startTime) {
        super(name);
        this.startTime = startTime;
    }

    @Override
    public void run() {

        System.out.println(getName());

        for(int i=startTime;i>=0;i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}
