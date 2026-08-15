package Hotel.Manager.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Pickup extends JFrame {
    Pickup(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5, 790, 590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel PUS = new JLabel("Pick Up Service ");
        PUS.setBounds(90, 11, 160, 25);
        PUS.setForeground(Color.WHITE);
        PUS.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(PUS);

        JLabel TOC = new JLabel("Type Of Car ");
        TOC.setBounds(32, 97, 89, 14);
        TOC.setForeground(Color.WHITE);
        TOC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(TOC);

        Choice c = new Choice();
        c.setBounds(123, 94, 150, 25);
        panel.add(c);

        try {
            Conn C = new Conn();
            ResultSet resultSet = C.statement.executeQuery("select distinct car_company from driver");
            while (resultSet.next()){
                c.add(resultSet.getString("car_company"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(5, 233, 790, 250);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {
            Conn C = new Conn();
            String q = "select * from driver";
            ResultSet resultSet = C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(5, 208, 99, 14);
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setForeground(Color.WHITE);
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(104, 208, 99, 14);
        age.setHorizontalAlignment(SwingConstants.CENTER);
        age.setForeground(Color.WHITE);
        panel.add(age);

        JLabel ps = new JLabel("Personnumber");
        ps.setBounds(203, 208, 99, 14);
        ps.setHorizontalAlignment(SwingConstants.CENTER);
        ps.setForeground(Color.WHITE);
        panel.add(ps);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(302, 208, 99, 14);
        gender.setHorizontalAlignment(SwingConstants.CENTER);
        gender.setForeground(Color.WHITE);
        panel.add(gender);


        JLabel company = new JLabel("Company");
        company.setBounds(401, 208, 99, 14);
        company.setHorizontalAlignment(SwingConstants.CENTER);
        company.setForeground(Color.WHITE);
        panel.add(company);



        JLabel carname = new JLabel("Car name");
        carname.setBounds(500, 208, 99, 14);
        carname.setHorizontalAlignment(SwingConstants.CENTER);
        carname.setForeground(Color.WHITE);
        panel.add(carname);

        JLabel available = new JLabel("Available");
        available.setBounds(599, 208, 99, 14);
        available.setHorizontalAlignment(SwingConstants.CENTER);
        available.setForeground(Color.WHITE);
        panel.add(available);

        JLabel location = new JLabel("Location");
        location.setBounds(698, 208, 97, 14);
        location.setHorizontalAlignment(SwingConstants.CENTER);
        location.setForeground(Color.WHITE);
        panel.add(location);

        JButton display = new JButton("Display");
        display.setBounds(200, 500, 120, 30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        display.setFocusable(false);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDriverTable(c, table);
            }
        });

        c.addItemListener(e -> updateDriverTable(c, table));

        JButton back = new JButton("Back");
        back.setBounds(420, 500, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(800, 600);
        setLocation(500, 100);
        setVisible(true);

    }

    static void main(String[] args) {
        new Pickup();
    }

    private void updateDriverTable(Choice c, JTable table) {
        String q = "select * from driver where car_company = '"+c.getSelectedItem()+"'";
        try {
            Conn conn = new Conn();
            ResultSet resultSet = conn.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
