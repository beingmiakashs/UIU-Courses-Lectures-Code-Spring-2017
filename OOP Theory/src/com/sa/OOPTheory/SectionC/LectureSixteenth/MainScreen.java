package com.sa.OOPTheory.SectionC.LectureSixteenth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by akashs on 4/10/17.
 */
public class MainScreen extends JFrame {

    JTextField textField;
    JButton button;
    JTextArea textArea;

    public MainScreen(){
        setSize(300,300);
        setLayout(new FlowLayout());

        textField = new JTextField();
        button = new JButton();
        textArea = new JTextArea("Exam mark status");

        button.setText("Check");
        textField.setColumns(15);
        textArea.setSize(100,100);

        JPanel panel1 = new JPanel(new BorderLayout());

        panel1.add(textField, BorderLayout.NORTH);
        panel1.add(button, BorderLayout.CENTER);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.setSize(50,50);
        panel2.setBackground(Color.darkGray);

        panel2.add(textArea);
        panel2.add(new JButton("Hello"));

        add(panel1);
        add(panel2);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField.getText();
                int number = Integer.parseInt(s);

                if(number>=55){
                    textArea.setText("Passed");
                }
                else{
                    textArea.setText("Failed");
                }
            }
        });

    }

    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
    }
}














