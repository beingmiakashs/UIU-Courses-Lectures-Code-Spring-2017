package com.sa.OOPLab.SectionSE.LabNine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by akashs on 4/8/17.
 */

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 9999);
            System.out.println("Server is connected");

            PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true
            );

            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()
                )
            );

            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            out.println(line);


            String res = in.readLine();
            System.out.println(res);





        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




