/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquest;

//import java.awt.*;
//import javax.swing.*;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;


public class UI {
    
    JavaQuest jq;
    
    JFrame window;
    public JTextArea messageText;
    
    public UI(JavaQuest jq){
        this.jq = jq;
        
        createMainField();
        
        window.setVisible(true);
    }
    
    public void createMainField(){
        window = new JFrame();
        window.setSize(1200, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.PINK);
        window.setLayout(null);
        
        messageText = new JTextArea("HELLO PABLO");
        messageText.setBounds(50,400,700,150);
        messageText.setBackground(Color.BLUE);
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
        window.add(messageText);
    }
    
}
