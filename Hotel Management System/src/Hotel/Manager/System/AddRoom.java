package Hotel.Manager.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener{

    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;

    AddRoom(){
        super("Add Room");
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        // Upper heading //
        JLabel l1 = new JLabel("Add Rooms");
        l1.setBounds(194, 10, 160, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        // Lower Heading //
        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64, 67, 152, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        t2 = new JTextField();
        t2.setBounds(200, 70, 156, 20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(15, 108, 115));
        panel.add(t2);

        // Availability //
        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64, 107, 152, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);
        t3 = new JComboBox(new String[] {"Available", "Occupied"});
        t3.setBounds(200, 110, 156, 20);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(15, 108, 115));
        panel.add(t3);

        // Price //
        JLabel l4 = new JLabel("Price(SEK)");
        l4.setBounds(64, 147, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);
        t4 = new JTextField();
        t4.setBounds(200, 150, 156, 20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(15, 108, 115));
        panel.add(t4);

        // Cleaning Status //
        JLabel l5 = new JLabel("Cleaning Status");
        l5.setBounds(64, 187, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);
        t5 = new JComboBox(new String[] {"Clean", "Dirty"});
        t5.setBounds(200, 190, 156, 20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(15, 108, 115));
        panel.add(t5);

        // Bed Type //
        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64, 227, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);
        t6 = new JComboBox(new String[] {"Single", "Double"});
        t6.setBounds(200, 230, 156, 20);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(15, 108, 115));
        panel.add(t6);

        // Button //
        b1 = new JButton("Add");
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        panel.add(b1);

        // Button //
        b2 = new JButton("Back");
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        panel.add(b2);

        // Image //
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i1 = new ImageIcon(image);
        JLabel label = new JLabel(i1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);


        setUndecorated(true);
        setLocation(20, 200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            try {
                Conn c = new Conn();
                String room = t2.getText().trim();
                String ava = (String) t3.getSelectedItem();
                String status = (String) t5.getSelectedItem();
                String price = t4.getText().trim();
                String type = (String) t6.getSelectedItem();

                if (room.isEmpty() || ava == null || status == null || price.isEmpty() || type == null) {
                    JOptionPane.showMessageDialog(null, "Please fill all sections");
                    return;
                }

                String q = "insert into room values('"+room+"','"+ava+"','"+status+"','"+price+"','"+type+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Room Successfully Added");
                this.setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddRoom();
    }

}
