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
            // SCENE 1
            case "restHut": jq.ev1.restHut(); break;
            case "inspectHut":  jq.ev1.inspectHut(); break;
            //case "enterHut": jq.sChanger.showHutInterior(); break;
            case "enterHut": jq.ev1.enterHut(); break;
            
            case "talkPerson": jq.ev1.talkPerson(); break;
            case "inspectPerson": jq.ev1.inspectPerson(); break;
            case "attackPerson": jq.ev1.attackPerson(); break;
            
            // SCENE 2
            case "openChest": jq.ev2.openChest(); break;
            case "inspectChest": jq.ev2.inspectChest(); break;
            case "inspectCave": jq.ev2.inspectCave(); break;
            case "talkCave": jq.ev2.talkCave(); break;
            case "enterCave": jq.ev2.enterCave(); break;

            // SCENE 3
            case "talkMonster": jq.ev3.talkMonster(); break;
            case "inspectMonster": jq.ev3.inspectMonster(); break;
            case "attackMonster": jq.ev3.attackMonster(); break;
            
            //Change Scenes
            case "goScene1": jq.sChanger.showScene1(); break;
            case "goScene2": jq.sChanger.showScene2(); break;
            //case "goScene3": jq.sChanger.showScene3(); break;
            
            // Game Over
            case "restart": jq.sChanger.existGameOverScreen(); jq.sChanger.showScene1(); break;
           
        }
    }
    
}
