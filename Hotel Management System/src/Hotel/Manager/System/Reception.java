package Hotel.Manager.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception() {

        super("Reception");
        setLayout(null);

        // Panel 1 //
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1660, 1040);
        panel.setBackground(new Color(3, 45, 48));
        panel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(panel);

        // Panel 2 //
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 1040);
        panel1.setBackground(new Color(3, 45, 48));
        panel1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(panel1);

        // Background image right //
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i2 = i1.getImage().getScaledInstance(550, 550, Image.SCALE_DEFAULT);
        ImageIcon imageIconb = new ImageIcon(i2);
        JLabel label = new JLabel(imageIconb);
        label.setBounds(350, 95, 550, 550);
        panel.add(label);

        // Background logo Left //
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i4 = i3.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIconb2 = new ImageIcon(i4);
        JLabel label2 = new JLabel(imageIconb2);
        label2.setBounds(20, 560, 250, 250);
        panel1.add(label2);


        // Buttons 1//
        JButton btnNCF = new JButton("New Customer From");
        btnNCF.setBounds(30, 30, 200, 30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        btnNCF.setFocusPainted(false);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });


        // Button 2 //
        JButton btnNCF2 = new JButton("Room");
        btnNCF2.setBounds(30, 70,  200, 30);
        btnNCF2.setBackground(Color.BLACK);
        btnNCF2.setForeground(Color.WHITE);
        btnNCF2.setFocusPainted(false);
        panel1.add(btnNCF2);
        btnNCF2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 3 //
        JButton btnNCF3 = new JButton("Department");
        btnNCF3.setBounds(30, 110,  200, 30);
        btnNCF3.setBackground(Color.BLACK);
        btnNCF3.setForeground(Color.WHITE);
        btnNCF3.setFocusPainted(false);
        panel1.add(btnNCF3);
        btnNCF3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 4 //
        JButton btnNCF4 = new JButton("All Employee Info");
        btnNCF4.setBounds(30, 150,  200, 30);
        btnNCF4.setBackground(Color.BLACK);
        btnNCF4.setForeground(Color.WHITE);
        btnNCF4.setFocusPainted(false);
        panel1.add(btnNCF4);
        btnNCF4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 5 //
        JButton btnNCF5 = new JButton("Customer Info");
        btnNCF5.setBounds(30, 190,  200, 30);
        btnNCF5.setBackground(Color.BLACK);
        btnNCF5.setForeground(Color.WHITE);
        btnNCF5.setFocusPainted(false);
        panel1.add(btnNCF5);
        btnNCF5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 6 //
        JButton btnNCF6 = new JButton("Manager Info");
        btnNCF6.setBounds(30, 190,  200, 30);
        btnNCF6.setBackground(Color.BLACK);
        btnNCF6.setForeground(Color.WHITE);
        btnNCF6.setFocusPainted(false);
        panel1.add(btnNCF6);
        btnNCF6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 7 //
        JButton btnNCF7 = new JButton("Checkout");
        btnNCF7.setBounds(30, 230,  200, 30);
        btnNCF7.setBackground(Color.BLACK);
        btnNCF7.setForeground(Color.WHITE);
        btnNCF7.setFocusPainted(false);
        panel1.add(btnNCF7);
        btnNCF7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 8 //
        JButton btnNCF8 = new JButton("Update Check-In Details");
        btnNCF8.setBounds(30, 270,  200, 30);
        btnNCF8.setBackground(Color.BLACK);
        btnNCF8.setForeground(Color.WHITE);
        btnNCF8.setFocusPainted(false);
        panel1.add(btnNCF8);
        btnNCF8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 9 //
        JButton btnNCF9 = new JButton("Update Room Status");
        btnNCF9.setBounds(30, 310,  200, 30);
        btnNCF9.setBackground(Color.BLACK);
        btnNCF9.setForeground(Color.WHITE);
        btnNCF9.setFocusPainted(false);
        panel1.add(btnNCF9);
        btnNCF9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 10 //
        JButton btnNCF10 = new JButton("Pickup Service");
        btnNCF10.setBounds(30, 350,  200, 30);
        btnNCF10.setBackground(Color.BLACK);
        btnNCF10.setForeground(Color.WHITE);
        btnNCF10.setFocusPainted(false);
        panel1.add(btnNCF10);
        btnNCF10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 11 //
        JButton btnNCF11 = new JButton("Search Room");
        btnNCF11.setBounds(30, 390,  200, 30);
        btnNCF11.setBackground(Color.BLACK);
        btnNCF11.setForeground(Color.WHITE);
        btnNCF11.setFocusPainted(false);
        panel1.add(btnNCF11);
        btnNCF11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.white);
        setSize(1950, 1090);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Reception();
    }
}
