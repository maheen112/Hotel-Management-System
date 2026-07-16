package Hotel.Manager.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame{

    Admin(){
        super("Admin");
        setLayout(null);

        // Button 1 //
        JButton b1 = new JButton("Add Employee");
        b1.setBounds(250, 230, 200, 30);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.setFocusPainted(false);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b1){

                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 2 //
        JButton b2 = new JButton("Add Room");
        b2.setBounds(250, 380, 200, 30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.setFocusPainted(false);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b2){

                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Button 3 //
        JButton b3 = new JButton("Add Driver");
        b3.setBounds(250, 530, 200, 30);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Tahoma", Font.BOLD, 15));
        b3.setFocusPainted(false);
        add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b3){

                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Logout //
        JButton b4 = new JButton("Logout");
        b4.setBounds(10, 750, 95, 30);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Tahoma", Font.BOLD, 15));
        b4.setFocusPainted(false);
        add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b4){
                        System.exit(777);
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Back //
        JButton b5 = new JButton("Back");
        b5.setBounds(110, 750, 95, 30);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("Tahoma", Font.BOLD, 15));
        b5.setFocusPainted(false);
        add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b5){
                        new Dassbord();
                        setVisible(false);
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        // Image 1 //
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i1 = imageIcon1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i1);
        JLabel l1 = new JLabel(imageIcon11);
        l1.setBounds(70, 180, 120, 120);
        add(l1);

        // Image 2 //
        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i2 =  imageIcon2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 = new ImageIcon(i2);
        JLabel l2 = new JLabel(imageIcon22);
        l2.setBounds(70, 340, 120, 120);
        add(l2);

        // Image 3 //
        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i3 = imageIcon3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon33 = new ImageIcon(i3);
        JLabel l3 = new JLabel(imageIcon33);
        l3.setBounds(70, 500, 120, 120);
        add(l3);

        // Image 4 //
        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i4 = imageIcon4.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon44 = new ImageIcon(i4);
        JLabel l4 = new JLabel(imageIcon44);
        l4.setBounds(1000, 240, 400, 400);
        add(l4);




        getContentPane().setBackground(new Color(3, 45, 48));
        setSize(1950, 1090);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Admin();
    }
}
