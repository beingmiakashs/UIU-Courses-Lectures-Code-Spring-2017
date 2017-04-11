package com.sa.OOPLab.SectionSE.LabSix;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by akashs on 4/4/17.
 */
public class HelloApp {
    private JTextField inputET;
    private JButton clickMeButton;
    private JTextArea showMessage;
    private JPanel mainPanel;

    public HelloApp() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = inputET.getText();
                res = res.toUpperCase();
                showMessage.setText(res);
                JOptionPane.showMessageDialog(null, res);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Application");
        HelloApp app = new HelloApp();
        frame.setContentPane(app.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}






