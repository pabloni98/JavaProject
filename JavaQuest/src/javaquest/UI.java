/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquest;

//import java.awt.*;
//import javax.swing.*;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;



public class UI {
    
    JavaQuest jq;
    
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];
    
    public UI(JavaQuest jq){
        this.jq = jq;
        
        createMainField();
        createBackground();
        
        window.setVisible(true);
    }
    
    public void createMainField(){
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        
        messageText = new JTextArea("HELLO PABLO");
        messageText.setBounds(50,410,700,150);
        messageText.setBackground(Color.BLACK);
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
        window.add(messageText);
    }
    
    public void createBackground(){   
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(50,50,700,350);
        bgPanel[1].setBackground(Color.BLUE);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);
        
        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0,0,700,350);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("pine.jpg"));
        bgLabel[1].setIcon(bgIcon);
        
        bgPanel[1].add(bgLabel[1]);
        
    }
    
}
