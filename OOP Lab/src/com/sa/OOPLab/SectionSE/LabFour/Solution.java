package com.sa.OOPLab.SectionSE.LabFour;

import com.sa.OOPLab.SectionD.LabFive.*;

/**
 * Created by akashs on 2/28/17.
 */
public abstract class Solution {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Triangle(10,5);
        shapes[1]= new Rectangle(10,10);
        //shapes[2] = new Shape();

        Triangle tri = new Triangle(10,5);
        Shape sh;
        sh = tri;
        sh.printDetails();

        //Rectangle rect = new Rectangle(10,10);
        sh = new Rectangle(10,10);
        sh.printDetails();
    }
}
