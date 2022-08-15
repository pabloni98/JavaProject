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
public class Event03 {
    
    public JavaQuest jq;
    public int monsterLife = 5;
    
    public Event03(JavaQuest jq)
    {
        this.jq = jq;
    }
    public void talkMonster()
    {
        if (monsterLife == 0)
        {
           jq.ui.messageText.setText("Monster: ..."); 
        }
        else
        {
          jq.ui.messageText.setText("Monster: What are you doing here?");   
        }
    }
    public void inspectMonster()
    {
        if (monsterLife == 0)
        {
            jq.ui.messageText.setText("The monster is dead.");
        }
        else
        {
            jq.ui.messageText.setText("The monster looks ready to attack.");
        }
    }
    public void attackMonster()
    {
        if (monsterLife != 1)
        {
            if (jq.player.hasShield == 0)
            {
                if(jq.player.hasSword == 0)
                {
                    if (jq.player.playerLife > 2)
                    {
                        jq.ui.messageText.setText("Monster: Take that!\n(You deal 1 damage and receive 2 damage)");
                        jq.player.playerLife--;
                        jq.player.playerLife--;
                        monsterLife--;
                    }
                    else if (jq.player.playerLife == 2)
                    {
                        jq.ui.messageText.setText("Monster: Hmph.");
                        jq.player.playerLife--;
                        jq.player.playerLife--;
                        monsterLife--;
                        jq.sChanger.showGameOverScreen(3);
                    }
                    else if (jq.player.playerLife == 1)
                    {
                        jq.ui.messageText.setText("Monster: Hmph.");
                        jq.player.playerLife--;
                        monsterLife--;
                        jq.sChanger.showGameOverScreen(3);
                    }
                }
                else if (jq.player.hasSword == 1)
                {
                    if (jq.player.playerLife > 2)
                    {
                        jq.ui.messageText.setText("Monster: That actually hurt.\n You deal 2 damage and receieve 2 damage.");
                        jq.player.playerLife--;
                        jq.player.playerLife--;
                        monsterLife--;
                        monsterLife--;
                    }
                    else if (jq.player.playerLife == 2)
                    {
                        jq.ui.messageText.setText("Monster: Hmph.");
                        jq.player.playerLife--;
                        jq.player.playerLife--;
                        monsterLife--;
                        monsterLife--;
                        jq.sChanger.showGameOverScreen(3);
                    }
                    else if (jq.player.playerLife == 1)
                    {
                        jq.ui.messageText.setText("Monster: Hmph.");
                        jq.player.playerLife--;
                        monsterLife--;
                        monsterLife--;
                        jq.sChanger.showGameOverScreen(3);
                    }
                }
                jq.player.updatePlayerStatus();
            }
            else
            {
                if(jq.player.hasSword == 0)
                {
                    if (jq.player.playerLife != 1)
                    {
                        jq.ui.messageText.setText("Monster: Take that!\n(You deal 1 damage and receive 2 damage)");
                        jq.player.playerLife--;
                        monsterLife--;
                    }
                    else if (jq.player.playerLife == 1)
                    {
                        jq.ui.messageText.setText("Monster: Hmph.");
                        jq.player.playerLife--;
                        monsterLife--;
                        jq.sChanger.showGameOverScreen(3);
                    }
                }
                else if (jq.player.hasSword == 1)
                {
                    if (jq.player.playerLife != 1)
                    {
                        jq.ui.messageText.setText("Monster: That actually hurt.\n(You deal 2 damage and receieve 2 damage)");
                        jq.player.playerLife--;
                        monsterLife--;
                        monsterLife--;
                    }
                    else if (jq.player.playerLife == 1)
                    {
                        jq.ui.messageText.setText("Monster: Hmph.");
                        jq.player.playerLife--;
                        monsterLife--;
                        monsterLife--;
                        jq.sChanger.showGameOverScreen(3);
                    }
                }
                jq.player.updatePlayerStatus(); 
            }
        }
        else
        {
           jq.ui.messageText.setText("You have deafeated the monster!"); 
           //monsterLife--;
        }
    }
}
