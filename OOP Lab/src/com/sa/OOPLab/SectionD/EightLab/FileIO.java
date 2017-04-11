package com.sa.OOPLab.SectionD.EightLab;

import java.io.*;

/**
 * Created by akashs on 4/3/17.
 */
public class FileIO {
    public static void main(String[] args) {
        try {
            /*
            File file = new File("input.txt");
            FileInputStream fin = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream("output.txt");
            */

            FileReader fin = new FileReader("input.txt");
            FileWriter fout = new FileWriter("output.txt", true);

            BufferedReader reader = new BufferedReader(fin);
            BufferedWriter writer =  new BufferedWriter(fout);

            /*
            while(true){
                int val = fin.read();
                if(val==-1) break;
                fout.write(val);
            }
            */

            while(true){
                String line = reader.readLine();
                if(line == null) break;
                writer.write(line+"\n");
            }

            reader.close();
            writer.close();


            fin.close();
            fout.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
