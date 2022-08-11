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
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;



public class UI {
    
    JavaQuest jq;
    
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];
    
    public UI(JavaQuest jq){
        this.jq = jq;
        
        createMainField();
        generateScreen();
        
        window.setVisible(true);
    }
    
    public void createMainField(){
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        
        messageText = new JTextArea("HELLO PABLO. THIS IS MY HOME.");
        messageText.setBounds(50,410,700,150);
        messageText.setBackground(Color.BLACK);
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
        window.add(messageText);
    }
    
    public void createBackground(int bgNum, String bgFileName){   
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,50,511,338);
        bgPanel[bgNum].setBackground(Color.BLACK);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[1]);
        
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700,350);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bgLabel[bgNum].setIcon(bgIcon);
            
        
    }
    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFileName, String choice1Name, String choice2Name,
            String choice3Name) {
        
        JPopupMenu popMenu = new JPopupMenu();
        
        JMenuItem menuItem[] = new JMenuItem[4];
        menuItem[1] = new JMenuItem("Go in");
        popMenu.add(menuItem[1]);
        
        menuItem[2] = new JMenuItem("Inspect");
        popMenu.add(menuItem[2]);
               
        
        JLabel objectLabel = new JLabel();
               objectLabel.setBounds(objx,objy,objWidth,objHeight);
        
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
        objectLabel.setIcon(objectIcon);
        
        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // write my code here
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
                if(SwingUtilities.isRightMouseButton(e)) {
                    popMenu.show(objectLabel, e.getX(), e.getY());
                    //do stuff when right mouse is clicked here (custom code from amrit vs. default MouseListener)
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
          
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });
        
        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]);
    }
    
    public void generateScreen() {
        
        // SCREEN1
        createBackground(1,"pines.png");
        createObject(1,250,50,300,300,"cabin.png", "Go inside", "", "");
    }
}
