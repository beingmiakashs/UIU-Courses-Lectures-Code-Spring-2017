package com.sa.OOPTheory.SectionSJ.LectureFive;

import java.util.Date;

/**
 * Created by akashs on 2/12/17.
 */
public class Student extends Person {
    private double cgpa;
    private double studetnId;
    public String name;

    public Student(){
        super();
    }

    public Student(double cgpa, double studetnId, String name,
                   String dob, String address) {
        //super(name, dob, address);
        super();
        this.cgpa = cgpa;
        this.studetnId = studetnId;
        this.name = name;

    }

    public void printDetails(){
        System.out.println(studetnId+" "+cgpa);
        System.out.println(this.name+" "+this.address+" "+getDob());
        System.out.println(super.calAge());
        System.out.println(birthPlaceName);
    }

    public int calAge(){
        return 45;
    }
}
