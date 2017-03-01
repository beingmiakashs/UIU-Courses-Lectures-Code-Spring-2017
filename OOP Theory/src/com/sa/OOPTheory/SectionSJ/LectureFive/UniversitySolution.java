package com.sa.OOPTheory.SectionSJ.LectureFive;

/**
 * Created by akashs on 2/14/17.
 */
public class UniversitySolution {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.teacherId = "t1";
        Teacher teacher2 = new Teacher();
        teacher2.teacherId = "t2";

        Student student = new Student(3.86, 124.5,"Anik","11-02-1992", "Dhanmondi");
        student.name = "Anik";
        System.out.println(student.name);

        teacher1 = teacher2;
        teacher2 = null;
        teacher1 = null;
        System.gc();
    }
}
