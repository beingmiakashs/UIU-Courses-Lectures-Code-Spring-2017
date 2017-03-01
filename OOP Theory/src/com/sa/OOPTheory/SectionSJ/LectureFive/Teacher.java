package com.sa.OOPTheory.SectionSJ.LectureFive;

/**
 * Created by akashs on 2/12/17.
 */
public class Teacher extends Person {
    public String teacherId;
    private Double salary;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(teacherId+" garbage collected");
    }
}
