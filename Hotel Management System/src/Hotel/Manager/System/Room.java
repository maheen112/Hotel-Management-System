package Hotel.Manager.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {

    JTable table;
    JButton back;

    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(600, 200, 200, 200);
        panel.add(label1);

        // Table //
        table = new JTable();
        table.setBounds(10, 40 , 500, 400);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {
            Conn c = new Conn();
            String Roominfo = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(Roominfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200, 500, 120, 30);
        back.setFocusable(false);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);

        JLabel roomN = new JLabel("Room No.");
        roomN.setBounds(12, 15, 80, 19);
        roomN.setForeground(Color.WHITE);
        roomN.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(roomN);

        JLabel availability = new JLabel("Availability");
        availability.setBounds(115, 15, 80, 19);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(availability);


        JLabel clean = new JLabel("Clean");
        clean.setBounds(216, 15, 150, 19);
        clean.setForeground(Color.WHITE);
        clean.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(330, 15, 150, 19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(price);

        JLabel bedt = new JLabel("Bed-Type");
        bedt.setBounds(417, 15, 150, 19);
        bedt.setForeground(Color.WHITE);
        bedt.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(bedt);




        setUndecorated(true);
        setLayout(null);
        setLocation(500, 100);
        setSize(900, 600);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Room();
    }
}
