package com.jvlearn;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 //creating a class for the jframe
class Frame extends JFrame{
    
    public Frame(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);


    //creating elements for login screen
    JLabel title = new JLabel("jvLearn-Online");
    JLabel usrLabel = new JLabel("username");
    JLabel passLabel = new JLabel("password");
    JPanel panel = new JPanel();
    JTextField usr = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton loginButton = new JButton("Login");

    
    //creating bounds(e.g size, position on the panel)
    title.setBounds(30, 100, 300, 30);
    usrLabel.setBounds(50,175,200,30);
    passLabel.setBounds(50,225,200,30);
    usr.setBounds(50, 200, 200,30);
    pass.setBounds(50, 250, 200, 30);
    loginButton.setBounds(50, 300, 200, 30);


    //adding attributes to the elements
    usrLabel.setFont(new Font("serif",Font.ITALIC, 10));
    passLabel.setFont(new Font("serif",Font.ITALIC, 10));
    title.setFont(new Font("serif", Font.BOLD, 30));
    panel.setBackground(new Color(176,224,230));
    loginButton.setBorder(null);
    loginButton.setForeground(new Color(255,255,255,255));
    loginButton.setBackground(Color.LIGHT_GRAY);

    //null layout for the panel so we can put the elements using coordinates
    panel.setLayout(null);

    //properties of the jframe
    this.setVisible(true);  
    this.setSize(300,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    //adding elements to the panel
    panel.add(title,CENTER_ALIGNMENT);
    panel.add(usr, CENTER_ALIGNMENT);
    panel.add(pass, CENTER_ALIGNMENT);
    panel.add(usrLabel);
    panel.add(passLabel);
    panel.add(loginButton);
    this.add(panel);
 
    }
}

