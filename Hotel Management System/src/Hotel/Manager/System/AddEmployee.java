package Hotel.Manager.System;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, phoneText, IdText, mailText;
    JRadioButton radioButtonM,radioButtonN;
    JComboBox combobox;
    JButton add, back;

    AddEmployee() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        // Name //
        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(new Color(16,108,115));
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        // Age //
        JLabel age = new JLabel("AGE");
        age.setBounds(60,75,150,27);
        age.setFont(new Font("serif",Font.BOLD,17));
        age.setForeground(Color.WHITE);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(200,75,150,27);
        ageText.setBackground(new Color(16,108,115));
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        setNumberOnly(ageText);
        panel.add(ageText);

        // Gender //
        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);
        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(new Color(3,45,48));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(Color.WHITE);
        radioButtonM.setFocusable(false);
        radioButtonM.setOpaque(false);
        radioButtonM.setContentAreaFilled(false);
        panel.add(radioButtonM);
        radioButtonN = new JRadioButton("FEMALE");
        radioButtonN.setBounds(280,120,100,27);
        radioButtonN.setBackground(new Color(3,45,48));
        radioButtonN.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonN.setForeground(Color.WHITE);
        radioButtonN.setFocusable(false);
        radioButtonN.setOpaque(false);
        radioButtonN.setContentAreaFilled(false);
        panel.add(radioButtonN);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonM);
        genderGroup.add(radioButtonN);

        // Job //
        JLabel job = new JLabel("JOB");
        job.setBounds(60,165,150,27);
        job.setFont(new Font("serif",Font.BOLD, 17));
        job.setForeground(Color.WHITE);
        panel.add(job);
        combobox = new JComboBox(new String[]{"Front Desk", "Housekeeping",
                "Kitchen Staff", "Room Service", "Manager", "Accountant", });
        combobox.setBackground(new Color(16, 108, 115));
        combobox.setBounds(200, 167, 150, 30);
        combobox.setFont(new Font("Tahoma", Font.BOLD,14));
        combobox.setForeground(Color.WHITE);
        panel.add(combobox);

        // Salary //
        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60, 220, 150, 27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200, 217, 150, 30);
        salaryText.setBackground(new Color(16,108,115));
        salaryText.setForeground(Color.WHITE);
        salaryText.setFont(new Font("Tahoma", Font.BOLD, 14));
        setNumberOnly(salaryText);
        panel.add(salaryText);

        // Telephone //
        JLabel phone = new JLabel("TELEPHONE");
        phone.setBounds(60, 270, 150, 27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBackground(new Color(16,108,115));
        phoneText.setForeground(Color.WHITE);
        phoneText.setFont(new Font("serif", Font.BOLD, 14));
        phoneText.setBounds(200, 267, 150, 27);
        setNumberOnly(phoneText);
        panel.add(phoneText);

        // Personnumber //
        JLabel Id = new JLabel("ID-CARD");
        Id.setBounds(60, 320, 150, 27);
        Id.setFont(new Font("serif", Font.BOLD, 17));
        Id.setForeground(Color.WHITE);
        panel.add(Id);
        IdText = new JTextField();
        IdText.setBackground(new Color(16,108,115));
        IdText.setForeground(Color.WHITE);
        IdText.setFont(new Font("serif", Font.BOLD, 14));
        IdText.setBounds(200, 317, 150, 27);
        setNumberOnly(IdText);
        panel.add(IdText);

        // E-mail //
        JLabel mail = new JLabel("E-MAIL");
        mail.setBounds(60, 370, 150, 27);
        mail.setFont(new Font("serif", Font.BOLD, 17));
        mail.setForeground(Color.WHITE);
        panel.add(mail);
        mailText = new JTextField();
        mailText.setBackground(new Color(16,108,115));
        mailText.setForeground(Color.WHITE);
        mailText.setFont(new Font("serif", Font.BOLD, 14));
        mailText.setBounds(200, 367, 150, 27);
        panel.add(mailText);


        JLabel AED = new JLabel("ADD EMPLOYEE DETAIL");
        AED.setBounds(450, 27, 445, 35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        // Add //
        add = new JButton("ADD");
        add.setBounds(80, 420, 100, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setFocusable(false);
        add.addActionListener(this);
        panel.add(add);

        // Back //
        back = new JButton("BACK");
        back.setBounds(200, 420, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.addActionListener(this);
        panel.add(back);

        // Image //
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 100, 300, 300);
        panel.add(label);



        setUndecorated(true);
        setLocation(60, 160);
        setLayout(null);
        setSize(900, 500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText().trim();
            String age = ageText.getText().trim();
            String salary = salaryText.getText().trim();
            String phone = phoneText.getText().trim();
            String id = IdText.getText().trim();
            String email = mailText.getText().trim();
            String job = (String) combobox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()){
                gender = "Male";
            } else if (radioButtonN.isSelected()){
                gender = "Female";
            }

            if (name.isEmpty() || age.isEmpty() || salary.isEmpty() || phone.isEmpty()
                    || id.isEmpty() || email.isEmpty() || job == null || gender == null) {
                JOptionPane.showMessageDialog(null, "Please fill all sections");
                return;
            }

            try {
                Conn c = new Conn();
                String q = "insert into employee values('"+name+"', '"+age+"', " +
                        "'"+gender+"', '"+job+"', '"+salary+"', '"+phone+"', " +
                        "'"+id+"', '"+email+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Employee Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new  AddEmployee();
    }

    private void setNumberOnly(JTextField textField) {
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string != null && isValidNumber(fb, offset, 0, string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text != null && isValidNumber(fb, offset, length, text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isValidNumber(FilterBypass fb, int offset, int length, String text) throws BadLocationException {
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                String newText = currentText.substring(0, offset) + text + currentText.substring(offset + length);
                return newText.matches("\\d*(\\.\\d*)?");
            }
        });
    }
}
