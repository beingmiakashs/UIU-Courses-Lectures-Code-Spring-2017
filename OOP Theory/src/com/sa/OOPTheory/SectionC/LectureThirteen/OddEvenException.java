package com.sa.OOPTheory.SectionC.LectureThirteen;

/**
 * Created by akashs on 3/22/17.
 */
public class OddEvenException extends Exception {
    int a;
    String status;

    public OddEvenException() {
    }

    public OddEvenException(String message, String status) {
        super(message);
        this.status = status;
    }
}
