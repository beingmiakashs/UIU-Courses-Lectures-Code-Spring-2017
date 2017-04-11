package com.sa.OOPLab.SectionSE.LabNine;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/**
 * Created by akashs on 4/8/17.
 */

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client is connected");

            PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true
            );

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()
                    )
            );

            String input = in.readLine();
            input = input.toUpperCase();

            out.println(input);





        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}









