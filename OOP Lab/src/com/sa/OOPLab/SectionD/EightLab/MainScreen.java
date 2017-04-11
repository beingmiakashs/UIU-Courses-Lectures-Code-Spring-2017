package com.sa.OOPLab.SectionD.EightLab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by akashs on 4/3/17.
 */
public class MainScreen extends JFrame{
    JTextField textField;
    JTextArea textArea;
    JButton button;
    public MainScreen() throws HeadlessException {
        setSize(400,400);
        setLayout(new FlowLayout());

        textArea = new JTextArea();
        textField = new JTextField("", 20);
        button = new JButton();
        button.setText("Click Me");

        add(textField);
        add(button);
        add(textArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
    }
}






