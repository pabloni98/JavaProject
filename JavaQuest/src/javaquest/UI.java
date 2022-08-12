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
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;



public class UI {
    
    JavaQuest jq;
    
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];
    
    // PLAYER UI
    JPanel lifePanel;
    JLabel lifeLabel[] = new JLabel[6];
    JPanel inventoryPanel;
    public JLabel swordLabel, shieldLabel, lanternLabel;
    
    public UI(JavaQuest jq){
        this.jq = jq;
        
        createMainField();
        createPlayerField();
        generateScene();
        
        window.setVisible(true);
    }
    
    public void createMainField(){
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        
        messageText = new JTextArea("HELLO STRANGER. THIS IS MY HOME.");
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
        bgPanel[bgNum].setBounds(50,50,511,450);
        bgPanel[bgNum].setBackground(Color.BLACK);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);
        
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0,0,700,350);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bgLabel[bgNum].setIcon(bgIcon);
            
        
    }
    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFileName, String choice1Name, String choice2Name,
            String choice3Name, String choice1Command, String choice2Command, String choice3Command) {
        
        JPopupMenu popMenu = new JPopupMenu();
        
        JMenuItem menuItem[] = new JMenuItem[4];
        menuItem[1] = new JMenuItem(choice1Name);
        menuItem[1].addActionListener(jq.aHandler);
        menuItem[1].setActionCommand(choice1Command);
        popMenu.add(menuItem[1]);
        
        menuItem[2] = new JMenuItem(choice2Name);
        menuItem[2].addActionListener(jq.aHandler);
        menuItem[2].setActionCommand(choice2Command);
        popMenu.add(menuItem[2]);
        
        menuItem[3] = new JMenuItem(choice3Name);
        menuItem[3].addActionListener(jq.aHandler);
        menuItem[3].setActionCommand(choice3Command);  
        popMenu.add(menuItem[3]);
        
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx,objy,objWidth,objHeight);
        
        // Just for development to see clickable areas
        //objectLabel.setOpaque(true);
        //objectLabel.setBackground(Color.blue);
        
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
        
    }
    public void createArrowButton(int bgNum, int x, int y, int width, int height, String arrowFileName, String command)
    {
        ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));
        JButton arrowButton = new JButton();
        arrowButton.setBounds(x, y, width, height);
        arrowButton.setBackground(null);
        arrowButton.setContentAreaFilled(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setIcon(arrowIcon);
        arrowButton.addActionListener(jq.aHandler);
        arrowButton.setActionCommand(command);
        arrowButton.setBorderPainted(false);
        
        bgPanel[bgNum].add(arrowButton);
        
    }
    
    public void createPlayerField()
    {
        lifePanel = new JPanel();
        lifePanel.setBounds(50, 0, 250, 50);
        lifePanel.setBackground(Color.black);
        lifePanel.setLayout(new GridLayout(1,5));
        window.add(lifePanel);
        
        ImageIcon lifeIcon = new ImageIcon(getClass().getClassLoader().getResource("heart.png"));
        Image image = lifeIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        lifeIcon = new ImageIcon(image);
        
        int i=1;
        while(i<6)
        {
            lifeLabel[i] = new JLabel();
            lifeLabel[i].setIcon(lifeIcon);
            lifePanel.add(lifeLabel[i]);
            i++;
        }
        
        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(650, 0, 100, 50);
        inventoryPanel.setBackground(Color.black);
        inventoryPanel.setLayout(new GridLayout(1, 3));
        window.add(inventoryPanel);
        
        // ITEMS
        swordLabel = new JLabel();
        ImageIcon swordIcon = new ImageIcon(getClass().getClassLoader().getResource("sword.png"));
        image = swordIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        swordIcon = new ImageIcon(image);
        swordLabel.setIcon(swordIcon);
        inventoryPanel.add(swordLabel);
        
        shieldLabel = new JLabel();
        ImageIcon shieldIcon = new ImageIcon(getClass().getClassLoader().getResource("shield.png"));
        image = shieldIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        shieldIcon = new ImageIcon(image);
        shieldLabel = new JLabel();
        shieldLabel.setIcon(shieldIcon);
        inventoryPanel.add(shieldLabel);
        
        lanternLabel = new JLabel();
        ImageIcon lanternIcon = new ImageIcon(getClass().getClassLoader().getResource("lantern.png"));
        image = lanternIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        lanternIcon = new ImageIcon(image);
        lanternLabel.setIcon(lanternIcon);
        inventoryPanel.add(lanternLabel);
        
    }
    
    public void generateScene() {
        
        // SCENE 1
        createBackground(1,"woods.jpg");
        createObject(1,100,120,100,200,"person.png", "Talk", "Attack", "Inspect", "talkPerson", "attackPerson", "inspectPerson");
        createObject(1,250,100,170,200,"cabin.png", "Rest", "Inspect", "Go Inside", "restHut", "inspectHut", "enterHut");
        createArrowButton(1, 420, 150, 70, 50, "rightarrow.png", "goScene2");
        bgPanel[1].add(bgLabel[1]);
        
        // SCENE 2
        createBackground(2,"forest.jpg");
        createObject(2,300,290,70,50,"chest.png", "Open", "Inspect", "", "openChest", "inspectChest", "");
        //createObject(1,250,50,300,300,"cabin.png", "Go inside", "Inspect", "", "enterHut", "inspectHut", "");
        createArrowButton(2, 20, 150, 70, 50, "leftarrow.png", "goScene1");
        bgPanel[2].add(bgLabel[2]);
        
        // SCENE HUT INTERIOR
        createBackground(3,"hutinterior.jpg");
        //createObject(1,250,50,300,300,"cabin.png", "Go inside", "Inspect", "", "enterHut", "inspectHut", "");
        createArrowButton(3, 30, 150, 70, 50, "leftarrow.png", "goScene1");
        bgPanel[3].add(bgLabel[3]);
    }
}
