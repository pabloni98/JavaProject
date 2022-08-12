/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquest;

/**
 *
 * @author pablo
 */
public class Player {
    
    JavaQuest jq;
    
    public int playerMaxLife;
    public int playerLife;
    
    public int hasSword;
    public int hasShield;
    public int hasLantern;
    
    public Player (JavaQuest jq)
    {
        this.jq = jq;
    }
    
    public void setPlayerDefaultStatus()
    {
        playerMaxLife = 5;
        playerLife = 3;
        hasSword = 0;
        hasShield = 0;
        hasLantern = 0;
        
        updatePlayerStatus();
    }
    
    public void updatePlayerStatus()
    {
        // Remove all life icons
        int i = 1;
        while (i < 6)
        {
            jq.ui.lifeLabel[i].setVisible(false);
            i++;
        }
        int lifeCount = playerLife;
        while(lifeCount != 0)
        {
            jq.ui.lifeLabel[lifeCount].setVisible(true);
            lifeCount--;
        }
        
        // check player items
        if(hasSword == 0)
        {
            jq.ui.swordLabel.setVisible(false);
        }
        if(hasSword == 1)
        {
            jq.ui.swordLabel.setVisible(true);
        }
        if(hasShield == 0)
        {
            jq.ui.shieldLabel.setVisible(false);
        }
        if(hasShield == 1)
        {
            jq.ui.shieldLabel.setVisible(true);
        }
        if(hasLantern == 0)
        {
            jq.ui.lanternLabel.setVisible(false);
        }
        if(hasLantern == 1)
        {
            jq.ui.lanternLabel.setVisible(true);
        }
    }
}

