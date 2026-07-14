package Hotel.Manager.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1, b2;

    Login(){

        super("Login");

        //Username
        JLabel label1 = new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.white);
        add(label1);

        //Password
        JLabel label2 = new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.white);
        add(label2);

        //User style
        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.white);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(new Color(26,104,110));
        add(textField1);

        //Password style
        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.white);
        passwordField1.setBackground(new Color(26,104,110));
        add(passwordField1);

        //Image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(new ImageIcon(i1));
        label.setBounds(300,0,300,300);
        add(label);

        //Button
        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.PLAIN,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.PLAIN,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);



        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(600,300);
        setLocation(400,270);
        setVisible(true);


    }

    //Database connection
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try {
                Conn c = new Conn();
                String user = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                // Closing the login Screen //
                if(resultSet.next()){
                    new Dassbord();
                    setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid!!");
                }
            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            System.exit(12);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
