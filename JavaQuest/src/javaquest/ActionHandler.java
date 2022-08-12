/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pablo
 */
public class ActionHandler implements ActionListener{
    
    JavaQuest jq;
    public ActionHandler(JavaQuest jq)
    {
        this.jq = jq;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        String yourChoice = e.getActionCommand();
        
        switch(yourChoice)
        {
            //case "enterHut": jq.ev1.enterHut(); break;
            case "enterHut": jq.sChanger.showHutInterior(); break;
            case "inspectHut":  jq.ev1.inspectHut(); break;
            
            //Change Scenes
            case "goScene1": jq.sChanger.showScene1(); break;
            case "goScene2": jq.sChanger.showScene2(); break;
           
        }
    }
    
}
