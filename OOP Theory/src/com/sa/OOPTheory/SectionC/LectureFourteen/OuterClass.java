package com.sa.OOPTheory.SectionC.LectureFourteen;

/**
 * Created by akashs on 4/3/17.
 */
public class OuterClass {
    private int a;

    public static class InnerClass{
        private int b;

        public void innerFun(){
            //System.out.println(a +" "+b);
        }
    }

    public void outerFun(){
        InnerClass innerClass = new InnerClass();
        System.out.println(a+" "+innerClass.b);

        class InnerClassFun{
            private int b;

            public void innerFun(){
                System.out.println(a +" "+b);
            }
        }
    }

}

class Solution{
    public static void main(String[] args) {
        //OuterClass outer = new OuterClass();
        OuterClass.InnerClass in = new OuterClass.InnerClass();
        //OuterClass.InnerClass.InnerClassSecond s = in.new InnerClassSecond();
        in.innerFun();
        //in.b;

        StudentActivities stA = new StudentActivities() {
            @Override
            public void clubList() {

            }
        };
    }
}

abstract class StudentActivities{
    public abstract void clubList();
}







