package com.sa.OOPTheory.SectionC.LectureNineteen;

/**
 * Created by akashs on 4/19/17.
 */
public class ThreadRunnable implements Runnable {

    Thread th;

    public ThreadRunnable() {
        th = new Thread(this,"hello");
    }

    @Override
    public void run() {

    }
}
