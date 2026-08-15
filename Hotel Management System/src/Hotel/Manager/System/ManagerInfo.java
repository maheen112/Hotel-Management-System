package Hotel.Manager.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ManagerInfo extends JFrame {

    ManagerInfo(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 990, 590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10, 34, 980, 450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3, 45, 48));
        panel.add(table);

        try {
            Conn c = new Conn();
            String q = "select * from employee where job = 'Manager'";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(350, 500, 120, 30);
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

        JLabel name = new JLabel("Name");
        name.setBounds(41, 15, 80, 19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(159, 15, 80, 19);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(273, 15, 80, 19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel job = new JLabel("Job");
        job.setBounds(416, 15, 80, 19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(536, 15, 80, 19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(salary);

        JLabel phn = new JLabel("Phone");
        phn.setBounds(656, 15, 80, 19);
        phn.setForeground(Color.WHITE);
        phn.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(phn);

        JLabel gmail = new JLabel("G-mail");
        gmail.setBounds(786, 15, 80, 19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gmail);

        JLabel id = new JLabel(" ID");
        id.setBounds(896, 15, 80, 19);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(id);

        setUndecorated(true);
        setLayout(null);
        setLocation(430, 100);
        setVisible(true);
        setSize(1000, 600);


    }

    static void main(String[] args) {
        new ManagerInfo();
    }
}
