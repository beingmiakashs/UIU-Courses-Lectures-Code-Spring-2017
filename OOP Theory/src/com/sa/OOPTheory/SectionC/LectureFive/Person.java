package com.sa.OOPTheory.SectionC.LectureFive;

import java.util.Date;

/**
 * Created by akashs on 2/15/17.
 */
public class Person extends BirthInfo {
    private String name;
    public Date dob;
    public String address;
    //private String birthPlaceName;

    public void printDetails(){
        System.out.println(name+" "+address);
    }
    public Person(String name, Date dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge(String currentDate){
        return 25;
    }
}
