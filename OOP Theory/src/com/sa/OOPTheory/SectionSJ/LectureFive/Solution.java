package com.sa.OOPTheory.SectionSJ.LectureFive;

/**
 * Created by akashs on 2/12/17.
 */
public class Solution {
    static int a = 10;
    final static double d = 25.0;

    public static void main(String[] args) {
        //d+=10;
        //System.out.println("Before modification: "+a);
        //Solution s = new Solution();
        //s.modify(a);
        //modifyPassByValue(a);
        //System.out.println("After modification: "+a);

        Box b = new Box(10,15,20);
        System.out.println("Before Modification: ");
        b.printDetails();
        modifyPassByRef(b);
        modifyPassByRef(b);
        System.out.println("After Modification: ");
        b.printDetails();
    }

    public static void modifyPassByRef(Box b1){
        b1.setWidth(15);
        b1.setHeight(20);
        b1.setDepth(25);
    }

    private static void modifyPassByValue(int num){
        num += 10;
        a = num;
        //this.a = a;
    }
}
