package Hotel.Manager.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {

    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add, back;

    SearchRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 690, 490);
        panel.setLayout(null);
        panel.setBackground( new Color(3, 45, 48));
        add(panel);

        JLabel searchForRoom = new JLabel("Search For Room");
        searchForRoom.setBounds(250, 11, 260, 50);
        searchForRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
        searchForRoom.setForeground(Color.WHITE);
        panel.add(searchForRoom);

        JLabel rbt = new JLabel("Room Bed Type: ");
        rbt.setBounds(30, 68, 122, 23);
        rbt.setFont(new Font("Tahoma", Font.BOLD, 14));
        rbt.setForeground(Color.WHITE);
        panel.add(rbt);

        JLabel rn = new JLabel("Room No");
        rn.setBounds(23, 162, 100, 20);
        rn.setFont(new Font("Tahoma", Font.BOLD, 14));
        rn.setForeground(Color.WHITE);
        panel.add(rn);

        JLabel av = new JLabel("Availability");
        av.setBounds(175, 162, 150, 20);
        av.setFont(new Font("Tahoma", Font.BOLD, 14));
        av.setForeground(Color.WHITE);
        panel.add(av);

        JLabel pr = new JLabel("Price");
        pr.setBounds(458, 162, 260, 20);
        pr.setFont(new Font("Tahoma", Font.BOLD, 14));
        pr.setForeground(Color.WHITE);
        panel.add(pr);

        JLabel cs = new JLabel("Cleaning Status");
        cs.setBounds(300, 162, 260, 20);
        cs.setFont(new Font("Tahoma", Font.BOLD, 14));
        cs.setForeground(Color.WHITE);
        panel.add(cs);



        JLabel bt = new JLabel("Bed Type");
        bt.setBounds(580, 162, 260, 20);
        bt.setFont(new Font("Tahoma", Font.BOLD, 14));
        bt.setForeground(Color.WHITE);
        panel.add(bt);



        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400, 69, 260, 50);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3, 45, 48));
        panel.add(checkBox);


        choice = new Choice();
        choice.add("Single");
        choice.add("Double");
        choice.setBounds(153, 70, 120, 20);
        choice.setFont(new Font("Tahoma", Font.BOLD, 14));
        choice.setForeground(Color.WHITE);
        choice.setBackground(new Color(16, 108, 115));
        panel.add(choice);


        table = new JTable();
        table.setBounds(0, 187, 700, 150);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);
        try {
            Conn c = new Conn();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }

        add = new JButton("SEARCH");
        add.setBounds(200, 400, 120, 30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setFocusable(false);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(380, 400, 120, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.addActionListener(this);
        panel.add(back);




        setUndecorated(true);
        setLayout(null);
        setLocation(500, 200);
        setVisible(true);
        setSize(700, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String Q = "select * from room where bed_type = '"+choice.getSelectedItem()+"'";
            String Q1 = "select * from room where avalability = 'Available' and bed_type = '"+choice.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if (checkBox.isSelected()) {
                    ResultSet resultSet1 = c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new SearchRoom();
    }
}
