package Hotel.Manager.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {

    Department(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 690, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0, 40, 700, 350);
        table.setBackground(new Color(4, 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        JButton back = new JButton("BACK");
        back.setBounds(400, 410, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.setFocusable(false);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel roomN = new JLabel("Department");
        roomN.setBounds(12, 15, 150, 19);
        roomN.setForeground(Color.WHITE);
        roomN.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(roomN);

        JLabel availability = new JLabel("Budget");
        availability.setBounds(350, 15, 80, 19);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(availability);

        try {
            Conn c = new Conn();
            String deptinfo = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(deptinfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }

        setUndecorated(true);
        setLayout(null);
        setLocation(550, 150);
        setSize(700, 500);
        setVisible(true);

    }

    static void main(String[] args) {
        new Department();
    }
}
