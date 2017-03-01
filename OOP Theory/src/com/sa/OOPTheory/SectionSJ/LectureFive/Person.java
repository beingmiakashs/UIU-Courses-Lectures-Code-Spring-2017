package com.sa.OOPTheory.SectionSJ.LectureFive;

import java.util.Date;

/**
 * Created by akashs on 2/12/17.
 */
public class Person extends BirthInfo {
    public String name;
    private String dob;
    public String address;
    public String birthPlaceName;

    public Person() {
    }

    public Person(String name, String dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public int calAge(){
        return 15;
    }
}
