package com.sa.OOPTheory.SectionC.LectureFive;

import com.sa.OOPTheory.SectionSJ.LectureThree.Box;

import java.util.Date;

/**
 * Created by akashs on 2/15/17.
 */
public class Student extends Person {
    public String studentID;
    private double cgpa;
    public String address;

    public Student(){
        super("anik", new Date(), "Dhanmondi");
    }

    public Student(String name, Date dob, String address, String studentID, double cgpa, String address1) {
        //super(name, dob,address);
        super(name, dob, address);
        this.studentID = studentID;
        this.cgpa = cgpa;
        this.address = address1;
    }

    public void printDetails(){
        System.out.println(studentID+" "+cgpa);
        System.out.println("Age: "+getAge("16/02/2017"));
        System.out.println(super.birthPlaceName);
        super.printDetails();
    }

    public int getAge(){
        getAge("12/2/2017");
        return 15;
    }




    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println(studentID+" garbage collected");
    }
}
