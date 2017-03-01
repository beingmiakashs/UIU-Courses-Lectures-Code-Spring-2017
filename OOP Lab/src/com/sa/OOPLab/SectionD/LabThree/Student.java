package com.sa.OOPLab.SectionD.LabThree;

/**
 * Created by akashs on 2/13/17.
 */
public class Student extends Person {
    public int studentId;
    public double cgpa;

    public void printDetails(){
        System.out.println(name+" "+age+" "+studentId+" "+cgpa);
    }
}
