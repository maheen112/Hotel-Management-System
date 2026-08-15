package Hotel.Manager.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class NewCustomer extends JFrame implements ActionListener {

    JComboBox combobox;
    JTextField Lnum, Lname, Lcountry, Ldeposit;
    JRadioButton M, F;
    Choice c1;
    JLabel date;
    JButton add, back;

    NewCustomer(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground( new Color(3, 45, 48));
        add(panel);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(550, 150, 200, 200);
        panel.add(imglabel);


        JLabel Ltitie = new JLabel("NEW CUSTOMER FROM");
        Ltitie.setBounds(118, 11, 260, 50);
        Ltitie.setFont(new Font("Tahoma", Font.BOLD, 20));
        Ltitie.setForeground(Color.WHITE);
        panel.add(Ltitie);


        JLabel lid = new JLabel("ID: ");
        lid.setBounds(35, 76, 200, 16);
        lid.setForeground(Color.WHITE);
        lid.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lid);
        combobox = new JComboBox(new String [] {"Passport", "National-ID", "Drivers License"});
        combobox.setBounds(271, 76, 150, 20);
        combobox.setFont(new Font("Tahoma", Font.BOLD, 14));
        combobox.setForeground(Color.WHITE);
        combobox.setBackground(new Color(16, 108, 115));
        panel.add(combobox);


        JLabel lnum = new JLabel("Number: ");
        lnum.setBounds(35, 111, 200, 16);
        lnum.setForeground(Color.WHITE);
        lnum.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lnum);
        Lnum = new JTextField();
        Lnum.setBounds(271, 111, 150, 20);
        Lnum.setBackground(new Color(16, 108, 115));
        Lnum.setForeground(Color.WHITE);
        Lnum.setFont(new Font("serif", Font.BOLD, 14));
        panel.add(Lnum);


        JLabel lname = new JLabel("Name: ");
        lname.setBounds(35, 151, 200, 16);
        lname.setForeground(Color.WHITE);
        lname.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lname);
        Lname = new JTextField();
        Lname.setBounds(271, 151, 150, 20);
        Lname.setBackground(new Color(16, 108, 115));
        Lname.setForeground(Color.WHITE);
        Lname.setFont(new Font("serif", Font.BOLD, 14));
        panel.add(Lname);


        JLabel lgender = new JLabel("Gander: ");
        lgender.setBounds(35, 191, 200, 16);
        lgender.setForeground(Color.WHITE);
        lgender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lgender);
        M = new JRadioButton("Male");
        M.setBounds(271, 191, 80, 15);
        M.setFont(new Font("serif", Font.BOLD, 15));
        M.setBackground(new Color(3, 45, 48));
        M.setForeground(Color.WHITE);
        M.setFocusable(false);
        panel.add(M);
        F = new JRadioButton("Female");
        F.setBounds(350, 191, 80, 16);
        F.setFont(new Font("serif", Font.BOLD, 15));
        F.setBackground(new Color(3, 45, 48));
        F.setForeground(Color.WHITE);
        F.setFocusable(false);
        panel.add(F);

        ButtonGroup mf = new ButtonGroup();
        mf.add(M);
        mf.add(F);


        JLabel lcountry = new JLabel("Country :");
        lcountry.setBounds(35, 231, 200, 16);
        lcountry.setForeground(Color.WHITE);
        lcountry.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lcountry);
        Lcountry = new JTextField();
        Lcountry.setBounds(271, 231, 150, 20);
        Lcountry.setBackground(new Color(16, 108, 115));
        Lcountry.setForeground(Color.WHITE);
        Lcountry.setFont(new Font("serif", Font.BOLD, 14));
        panel.add(Lcountry);


        JLabel lroom = new JLabel("Allocated Room Number :");
        lroom.setBounds(35, 275, 220, 16);
        lroom.setForeground(Color.WHITE);
        lroom.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lroom);
        c1 = new Choice();
        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        c1.setBounds(271, 274, 150, 20);
        c1.setFont(new Font("Tahoma", Font.BOLD, 14));
        c1.setForeground(Color.white);
        c1.setBackground(new Color(16, 108, 115));
        panel.add(c1);


        JLabel lcis = new JLabel("Check-In :");
        lcis.setBounds(35, 316, 220, 16);
        lcis.setForeground(Color.WHITE);
        lcis.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lcis);
        Date date1 = new Date();
        date = new JLabel(""+date1);
        date.setBounds(271, 316, 220, 16);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(date);


        JLabel ldeposit = new JLabel("Deposit :");
        ldeposit.setBounds(35, 359, 200, 16);
        ldeposit.setForeground(Color.WHITE);
        ldeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(ldeposit);
        Ldeposit = new JTextField();
        Ldeposit.setBounds(271, 359, 150, 20);
        Ldeposit.setBackground(new Color(16, 108, 115));
        Ldeposit.setForeground(Color.WHITE);
        Ldeposit.setFont(new Font("serif", Font.BOLD, 14));
        panel.add(Ldeposit);


        add = new JButton("ADD");
        add.setBounds(100, 430, 120, 30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setFocusable(false);
        add.addActionListener(this);
        panel.add(add);



        back = new JButton("BACK");
        back.setBounds(260, 430, 120, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.setFocusable(false);
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true);
        setLayout(null);
        setLocation(500, 150);
        setVisible(true);
        setSize(850, 550);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            Conn c = new Conn();
            String radiobtn = null;
            if (M.isSelected()){
                radiobtn = "Male";
            } else if (F.isSelected()) {
                radiobtn = "Female";
            }

            String s1 = (String)combobox.getSelectedItem();
            String s2 = Lnum.getText().trim();
            String s3 = Lname.getText().trim();
            String s4 = radiobtn;
            String s5 = Lcountry.getText().trim();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = Ldeposit.getText().trim();

            if (s1 == null || s2.isEmpty() || s3.isEmpty() || s4 == null || s5.isEmpty() || s6 == null || s8.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all sections properly");
                return;
            }


            try {
                PreparedStatement checkRoom = c.connection.prepareStatement("select * from room where roomnumber = ?");
                checkRoom.setString(1, s6);
                ResultSet roomResult = checkRoom.executeQuery();

                if (!roomResult.next()) {
                    JOptionPane.showMessageDialog(null, "Selected room does not exist");
                    return;
                }

                String roomAvailability = roomResult.getString(2);
                if ("Occupied".equalsIgnoreCase(roomAvailability)) {
                    JOptionPane.showMessageDialog(null, "This room is already occupied");
                    return;
                }

                String q = "insert into customer values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement addCustomer = c.connection.prepareStatement(q);
                addCustomer.setString(1, s1);
                addCustomer.setString(2, s2);
                addCustomer.setString(3, s3);
                addCustomer.setString(4, s4);
                addCustomer.setString(5, s5);
                addCustomer.setString(6, s6);
                addCustomer.setString(7, s7);
                addCustomer.setString(8, s8);
                addCustomer.executeUpdate();

                ResultSetMetaData roomMetaData = roomResult.getMetaData();
                String availabilityColumn = roomMetaData.getColumnName(2).replace("`", "``");
                String q1 = "update room set `" + availabilityColumn + "` = 'Occupied' where roomnumber = ?";
                PreparedStatement updateRoom = c.connection.prepareStatement(q1);
                updateRoom.setString(1, s6);
                updateRoom.executeUpdate();
                JOptionPane.showMessageDialog(null, "Added Successfully");


            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new  NewCustomer();
    }
}
