package com.sa.OOPLab.SectionD.LabSeven;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by akashs on 3/27/17.
 */
public class HelloApp {
    private JTextField username;
    private JButton clickMeButton;
    private JPanel mainPanel;

    public HelloApp(){


        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = username.getText();
                uname = uname.toUpperCase();

                JOptionPane.showMessageDialog(null, uname);
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello Application");
        HelloApp app = new HelloApp();
        jFrame.setContentPane(app.mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}








