package com.sa.OOPTheory.SectionC.LectureNineteen;

/**
 * Created by akashs on 4/17/17.
 */
public class MyThread extends Thread{

    int start;
    int end;
    Counter counter;

    public MyThread(String name, int start, int end, Counter counter) {
        super(name);
        this.start = start;
        this.end = end;
        this.counter = new Counter();
    }

    @Override
    public synchronized void run() {

        for(;start<end; start++) {
            if(start%2==0){
                //synchronized (counter) {
                    counter.total++;
                //}
            }
        }
    }
}
