package Hotel.Manager.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame implements ActionListener {

    JButton back;

    CustomerInfo(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5, 890, 590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10, 40, 870, 450);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        JLabel id = new JLabel("ID");
        id.setBounds(31, 11, 46, 25);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(id);

        JLabel num = new JLabel("Number");
        num.setBounds(150, 11, 100, 25);
        num.setForeground(Color.WHITE);
        num.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(num);

        JLabel name = new JLabel("Name");
        name.setBounds(270, 11, 100, 25);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(360, 11, 100, 25);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(480, 11, 100, 25);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(600, 11, 100, 25);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(room);

        JLabel tim = new JLabel("Check-In ");
        tim.setBounds(680, 11, 100, 25);
        tim.setForeground(Color.WHITE);
        tim.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(tim);


        JLabel deposit = new JLabel("Deposit");
        deposit.setBounds(800, 11, 100, 25);
        deposit.setForeground(Color.WHITE);
        deposit.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(deposit);

        back = new JButton("BACK");
        back.setBounds(450, 510, 120, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.addActionListener(this);
        panel.add(back);


        try {
            Conn c = new Conn();
            String q = "select * from customer";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }

        

        setUndecorated(true);
        setLayout(null);
        setSize(900, 600);
        setLocation(500, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new CustomerInfo();
    }
}
