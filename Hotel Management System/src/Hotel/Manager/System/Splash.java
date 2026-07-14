package Hotel.Manager.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash(){

        super(" Splash");

        int width = 858;
        int height = 600;
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        Image scaledImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(new ImageIcon(scaledImage));
        label.setBounds(0,0,width,height);
        add(label);
        setLayout(null);
        setSize(width,height);
        setVisible(true);
        setLocation(300,80);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();

    }
}
