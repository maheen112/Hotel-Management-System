package Hotel.Manager.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dassbord extends JFrame implements ActionListener {

    JButton add, rec;

    Dassbord() {
        super(" HOTEL MANAGEMENT SYSTEM");

        // Reception Button //
        rec = new JButton("Reception");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,95,0));
        rec.setForeground(Color.white);
        rec.setFocusPainted(false);
        rec.addActionListener(this);
        add(rec);

        // Admin Button //
        add = new JButton("Admin");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(255,95,0));
        add.setForeground(Color.white);
        add.addActionListener(this);
        add.setFocusPainted(false);
        add(add);


        //Admin Image//
        ImageIcon imageIconb = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = imageIconb.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(850, 300, 200, 195);
        add(label1);

        //Reception Image//
        ImageIcon imageIconbb = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i3 = imageIconbb.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon112 = new ImageIcon(i3);
        JLabel label11 = new JLabel(imageIcon112);
        label11.setBounds(400, 300, 200, 195);
        add(label11);


        //Background Video//
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1950, 1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0, 0, 1950, 1090);
        add(label);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rec) {

        }else {

        }

    }

    public static void main(String[] args) {
        new Dassbord();
    }
}
