package com.sa.OOPLab.SectionSE.LabFour;

import com.sa.OOPLab.SectionD.LabFive.*;

/**
 * Created by akashs on 2/28/17.
 */
public class Solution {
    public static void main(String[] args) {
        Triangle tri = new Triangle(10,5);
        Shape sh;
        sh = tri;
        sh.printDetails();

        //Rectangle rect = new Rectangle(10,10);
        sh = new Rectangle(10,10);
        sh.printDetails();
    }
}
