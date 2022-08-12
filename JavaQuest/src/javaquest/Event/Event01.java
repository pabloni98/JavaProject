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
    public void restHut()
    {
        if(jq.player.playerLife != jq.player.playerMaxLife)
        {
            jq.ui.messageText.setText("You rest until morning.\n(Your life has recovered)");
            jq.player.playerLife++;
            jq.player.updatePlayerStatus();
        }
        else
        {
            jq.ui.messageText.setText("You rest until morning.\n(Your life is already fool)");
        }
    }
   
    
    public void talkPerson()
    {
        jq.ui.messageText.setText("Feel free to rest inside.");
    }
    public void inspectPerson()
    {
        jq.ui.messageText.setText("The person looks mysterious.\nYou are not sure whether you can trust him.");
    }
    public void attackPerson()
    {
        
        if (jq.player.hasShield == 0)
        {
            if(jq.player.hasSword == 0)
            {
                if (jq.player.playerLife != 1)
                {
                    jq.ui.messageText.setText("Person: Why would you do that?\n(The person pushes you back and your life decreases by 1)");
                    jq.player.playerLife--;
                    //jq.player.updatePlayerStatus();
                }
                else if (jq.player.playerLife == 1)
                {
                    jq.ui.messageText.setText("Person: How foolish.");
                    jq.player.playerLife--;
                    //jq.player.updatePlayerStatus();
                }
            }
            else if (jq.player.hasSword == 1)
            {
                jq.ui.messageText.setText("Person: Why?\n(You have defeated the person and took his shield).");
                jq.player.hasShield = 1;
                //jq.player.updatePlayerStatus();
            }
            jq.player.updatePlayerStatus();
        }
        else
        {
            jq.ui.messageText.setText("Person: Just leave me alone. What more do you want?");
        }
        
    }
    
    
}
