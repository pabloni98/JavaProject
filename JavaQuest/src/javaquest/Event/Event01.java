/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquest.Event;

import javaquest.JavaQuest;

/**
 *
 * @author pablo
 */
public class Event01 {
    
    JavaQuest jq;
    
    public Event01(JavaQuest jq)
    {
        this.jq = jq;
    }
    
    public void inspectHut()
    {
        jq.ui.messageText.setText("This is my house. Would you like to come inside?");
    }
    public void enterHut()
    {
        jq.ui.messageText.setText("You enter the house."); 
    }
}
