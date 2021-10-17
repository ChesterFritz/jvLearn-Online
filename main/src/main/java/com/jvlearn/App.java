package com.jvlearn;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Send Noods");

        
        label1.setFont(new Font("Serif",Font.BOLD,25));
        label1.setSize(500,500);
        

        frame.add(label1);
        
        frame.setLocationRelativeTo(null);
        frame.setSize(800,800);
        frame.setVisible(true);   

    }
}
