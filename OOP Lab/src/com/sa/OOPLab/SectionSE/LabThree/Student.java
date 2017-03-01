package com.sa.OOPLab.SectionSE.LabThree;

/**
 * Created by akashs on 2/14/17.
 */
public class Student extends Person{
    public String studentId;
    public double cgpa;

    public void printDetails(){
        System.out.println(studentId+" "+cgpa);
        System.out.println(getName()+" "+address);
    }
}
