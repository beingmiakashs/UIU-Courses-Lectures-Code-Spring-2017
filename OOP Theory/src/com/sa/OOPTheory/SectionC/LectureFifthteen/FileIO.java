package com.sa.OOPTheory.SectionC.LectureFifthteen;

import java.io.*;

/**
 * Created by akashs on 4/5/17.
 */
public class FileIO {
    public static void main(String[] args) {
        try {
//            FileInputStream fin = new FileInputStream("input.txt");
//            File file = new File("output.txt");
//            FileOutputStream fout = new FileOutputStream(file);

            FileReader fin = new FileReader("input.txt");
            FileWriter fout = new FileWriter("output.txt", true);

            BufferedReader bin = new BufferedReader(fin);
            BufferedWriter bout = new BufferedWriter(fout);

//            while(true){
//                int val = fin.read();
//                if(val==-1) break;
//                fout.write(val);
//            }

            while(true){
                String line = bin.readLine();
                System.out.println(line);

                if(line==null)  break;
                bout.write(line);
            }

            bin.close();
            bout.close();

            fin.close();
            fout.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
