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

public class Event02 {
    
    public JavaQuest jq;
    
    public Event02(JavaQuest jq)
    {
        this.jq = jq;
    }
    public void openChest()
    {
        if (jq.player.hasSword == 0)
        {
            jq.ui.messageText.setText("You found a sword.\n(Sword item unlocked)");
            jq.player.hasSword = 1;
            jq.player.updatePlayerStatus();
        }
        else
        {
            jq.ui.messageText.setText("There's nothing inside...");
        }
    }
    public void inspectChest()
    {
        jq.ui.messageText.setText("There's a suspicious chest.");
    }
    
    public void inspectCave()
    {
        jq.ui.messageText.setText("The cave is so dark you can't see anything.");
    }
    public void talkCave()
    {
        jq.ui.messageText.setText("You shout and hear your echo resounding.");
    }
    public void enterCave()
    {
        if (jq.player.hasLantern == 0)
        {
           jq.ui.messageText.setText("The cave is too dark to enter.\nTry finding something to illuminate the way.");
        }
        else
        {
            jq.sChanger.showScene3(); 
        }
        
    }
}
