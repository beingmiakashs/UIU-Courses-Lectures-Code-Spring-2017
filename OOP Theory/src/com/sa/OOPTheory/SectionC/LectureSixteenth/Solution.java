package com.sa.OOPTheory.SectionC.LectureSixteenth;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by akashs on 4/10/17.
 */
public class Solution {
    public static void main(String[] args) {
        //ArrayList<Integer> ar = new ArrayList();

//        LinkedList<Integer> ar = new LinkedList<>();
//
//        ar.add(100);
//        ar.add(25);
//        ar.add(200);
//        ar.add(30);
//
//        Collections.sort(ar);
//        Collections.reverse(ar);
//
//        for(int i=0;i<ar.size();i++){
//            int n = ar.get(i);
//            System.out.println(n);
//        }
//
//        for( int n : ar){
//            System.out.println(n);
//        }


//        Hashtable<String, Double> map = new Hashtable<>();
//
//        map.put("011151236", 3.95);
//        map.put("011151222", 3.75);
//
//        System.out.println(map.get("011151220"));

//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Safat", 3.75));
//        students.add(new Student("Anik", 3.75));
//        students.add(new Student("Naim", 3.90));
//
//        Collections.sort(students);
//
//        for( Student st : students){
//            System.out.println(st.name+" "+st.cgpa);
//        }

        Exam exam1 = new Exam("Mid", 120);
        Exam exam2 = new Exam("Final", 150);

        try {
            FileOutputStream fout = new FileOutputStream("fileOut");
            ObjectOutputStream obOut = new ObjectOutputStream(fout);

            obOut.writeObject(exam1);
            obOut.writeObject(exam2);

            obOut.close();
            fout.close();

            FileInputStream fin = new FileInputStream("fileOut");
            ObjectInputStream obIn =  new ObjectInputStream(fin);

            Exam e1 = (Exam)obIn.readObject();
            Exam e2 = (Exam)obIn.readObject();


            System.out.println(e1.examName);
            System.out.println(e2.examName);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}


class Exam implements Serializable{
    public String examName;
    public double duration;

    public Exam(String examName, double duration) {
        this.examName = examName;
        this.duration = duration;
    }
}


class Student implements Comparable<Student>{
    public String name;
    public double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {

        if(this.cgpa > o.cgpa){
            return -1;
        }
        else if (this.cgpa < o.cgpa){
            return 1;
        }
        else{
            return  this.name.compareTo(o.name);
        }

    }
}








