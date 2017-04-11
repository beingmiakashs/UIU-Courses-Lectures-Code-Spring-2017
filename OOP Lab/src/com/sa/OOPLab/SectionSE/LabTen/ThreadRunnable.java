package com.sa.OOPLab.SectionSE.LabTen;

/**
 * Created by akashs on 4/11/17.
 */
public class ThreadRunnable implements Runnable {

    private String name;
    public Thread th;

    public ThreadRunnable(String name) {
        this.name = name;
        th = new Thread(this, name);

    }

    @Override
    public void run() {

    }
}
