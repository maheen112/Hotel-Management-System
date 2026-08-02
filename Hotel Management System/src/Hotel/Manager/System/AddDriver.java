package Hotel.Manager.System;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {

    JTextField nameT, Age, PersonNumber, Loc ;
    JRadioButton GenderM, GenderF, AvaY, AvaN;
    JComboBox<String> CarC, CarM;
    JButton add, back;


    AddDriver(){

        setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);


        JLabel label = new JLabel("ADD DRIVERS");
        label.setBounds(204, 10, 200 ,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(label);

        JLabel name =new JLabel("NAME");
        name.setBounds(64, 70, 102,22);
        name.setFont(new Font("Tahoma", Font.BOLD, 16));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameT = new JTextField();
        nameT.setBounds(204, 70, 170, 22);
        nameT.setBackground(new Color(15, 108, 115));
        nameT.setFont(new Font("serif", Font.BOLD, 14));
        nameT.setForeground(Color.WHITE);
        panel.add(nameT);

        JLabel age =new JLabel("AGE");
        age.setBounds(64, 110, 102,22);
        age.setFont(new Font("Tahoma", Font.BOLD, 16));
        age.setForeground(Color.WHITE);
        panel.add(age);
        Age = new JTextField();
        Age.setBounds(204, 110, 170, 22);
        Age.setBackground(new Color(15, 108, 115));
        Age.setFont(new Font("serif", Font.BOLD, 14));
        Age.setForeground(Color.WHITE);
        setNumberOnly(Age);
        panel.add(Age);

        JLabel personNumber =new JLabel("ID");
        personNumber.setBounds(64, 150, 142,22);
        personNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        personNumber.setForeground(Color.WHITE);
        panel.add(personNumber);
        PersonNumber = new JTextField();
        PersonNumber.setBounds(204, 150, 170, 22);
        PersonNumber.setBackground(new Color(15, 108, 115));
        PersonNumber.setFont(new Font("serif", Font.BOLD, 14));
        PersonNumber.setForeground(Color.WHITE);
        setNumberOnly(PersonNumber);
        panel.add(PersonNumber);

        JLabel gender =new JLabel("GENDER");
        gender.setBounds(64, 190, 102,22);
        gender.setFont(new Font("Tahoma", Font.BOLD, 16));
        gender.setForeground(Color.WHITE);
        panel.add(gender);
        GenderM = new JRadioButton("MALE");
        GenderM.setBounds(204, 190, 82, 22);
        GenderM.setFont(new Font("Tahoma", Font.BOLD, 14));
        GenderM.setForeground(Color.WHITE);
        GenderM.setFocusable(false);
        GenderM.setBackground(new Color(3, 45, 48));
        panel.add(GenderM);
        GenderF = new JRadioButton("FEMALE");
        GenderF.setBounds(294, 190, 82, 22);
        GenderF.setFont(new Font("Tahoma", Font.BOLD, 14));
        GenderF.setForeground(Color.WHITE);
        GenderF.setFocusable(false);
        GenderF.setBackground(new Color(3, 45, 48));
        panel.add(GenderF);


        ButtonGroup MaFegroup = new ButtonGroup();
        MaFegroup.add(GenderM);
        MaFegroup.add(GenderF);

        JLabel carC =new JLabel("CAR COMPANY");
        carC.setBounds(64, 230, 142,22);
        carC.setFont(new Font("Tahoma", Font.BOLD, 15));
        carC.setForeground(Color.WHITE);
        panel.add(carC);
        CarC = new JComboBox<>(new String[] {"NISSAN", "TOYOTA", "MERCEDES", "BMW", "AUDI"});
        CarC.setBounds(204, 230, 170, 22);
        CarC.setBackground(new Color(15, 108, 115));
        CarC.setFont(new Font("Tahoma", Font.BOLD, 14));
        CarC.setForeground(Color.WHITE);
        panel.add(CarC);
        CarC.addActionListener(e -> updateCarModels());

        JLabel carM =new JLabel("CAR MODEL");
        carM.setBounds(64, 270, 142,22);
        carM.setFont(new Font("Tahoma", Font.BOLD, 15));
        carM.setForeground(Color.WHITE);
        panel.add(carM);
        CarM = new JComboBox<>();
        CarM.setBounds(204, 270, 170, 22);
        CarM.setBackground(new Color(15, 108, 115));
        CarM.setFont(new Font("Tahoma", Font.BOLD, 14));
        CarM.setForeground(Color.WHITE);
        panel.add(CarM);
        updateCarModels();


        JLabel ava =new JLabel("AVAILABLE");
        ava.setBounds(64, 310, 142,22);
        ava.setFont(new Font("Tahoma", Font.BOLD, 15));
        ava.setForeground(Color.WHITE);
        panel.add(ava);
        AvaY = new JRadioButton("YES");
        AvaY.setBounds(204, 310, 70, 22);
        AvaY.setFont(new Font("Tahoma", Font.BOLD, 14));
        AvaY.setForeground(Color.WHITE);
        AvaY.setFocusable(false);
        AvaY.setBackground(new Color(3, 45, 48));
        panel.add(AvaY);
        AvaN = new JRadioButton("NO");
        AvaN.setBounds(294, 310, 70, 22);
        AvaN.setFont(new Font("Tahoma", Font.BOLD, 14));
        AvaN.setForeground(Color.WHITE);
        AvaN.setFocusable(false);
        AvaN.setBackground(new Color(3, 45, 48));
        panel.add(AvaN);

        ButtonGroup availabilityGroup = new ButtonGroup();
        availabilityGroup.add(AvaY);
        availabilityGroup.add(AvaN);


        JLabel loc =new JLabel("LOCATION");
        loc.setBounds(64, 350, 102,22);
        loc.setFont(new Font("Tahoma", Font.BOLD, 15));
        loc.setForeground(Color.WHITE);
        panel.add(loc);
        Loc = new JTextField();
        Loc.setBounds(204, 350, 170, 22);
        Loc.setBackground(new Color(15, 108, 115));
        Loc.setFont(new Font("serif", Font.BOLD, 14));
        Loc.setForeground(Color.WHITE);
        panel.add(Loc);


        add = new JButton("ADD");
        add.setFocusable(false);
        add.setBounds(80, 420, 100, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);


        back = new JButton("BACK");
        back.setFocusable(false);
        back.setBounds(210, 420, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500, 60, 300, 300);
        panel.add(label1);



        setUndecorated(true);
        setLocation(20, 200);
        setSize(900, 500);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameT.getText().trim();
            String age = Age.getText().trim();
            String id = PersonNumber.getText().trim();
            String loc = Loc.getText().trim();
            String carC = (String) CarC.getSelectedItem();
            String carM = (String) CarM.getSelectedItem();
            String gender = null;
            if (GenderM.isSelected()){
                gender = "Male";
            } else if (GenderF.isSelected()) {
                gender = "Female";
            }
            String ava = null;
            if (AvaY.isSelected()){
                ava = "Yes";
            } else if (AvaN.isSelected()) {
                ava = "No";
            }

            if (name.isEmpty() || age.isEmpty() || id.isEmpty() || loc.isEmpty()
                    || carC == null || carM == null || gender == null || ava == null) {
                JOptionPane.showMessageDialog(null, "Please fill all sections");
                return;
            }

            try {
                Conn c = new Conn();
                String q = "Insert into driver values('"+name+"', '"+age+"', " +
                        "'"+id+"', '"+gender+"', '"+carC+"', '"+carM+"', " +
                        "'"+ava+"', '"+loc+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Driver Successfully Added");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddDriver();
    }

    private void updateCarModels() {
        String brand = (String) CarC.getSelectedItem();
        CarM.removeAllItems();

        String[] models;
        if ("NISSAN".equals(brand)) {
            models = new String[] {"Altima", "Maxima", "Rogue", "Pathfinder"};
        } else if ("TOYOTA".equals(brand)) {
            models = new String[] {"Corolla", "Camry", "RAV4", "Land Cruiser"};
        } else if ("MERCEDES".equals(brand)) {
            models = new String[] {"C-Class", "E-Class", "S-Class", "GLC"};
        } else if ("BMW".equals(brand)) {
            models = new String[] {"3 Series", "5 Series", "X5", "7 Series"};
        } else {
            models = new String[] {"A4", "A6", "Q5", "Q7"};
        }

        for (String model : models) {
            CarM.addItem(model);
        }
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
                return newText.matches("\\d*");
            }
        });
    }

}
