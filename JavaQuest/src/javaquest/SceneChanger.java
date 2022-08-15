/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquest;

import java.util.HashSet;

/**
 *
 * @author pablo
 */
public class SceneChanger {
    
    JavaQuest jq;
    
    public SceneChanger(JavaQuest jq)
    {
        this.jq = jq;
    }
    public void showScene1()
    {
        
        jq.ui.bgPanel[1].setVisible(true);
	jq.ui.bgPanel[2].setVisible(false);	
        jq.ui.messageText.setText("Oh? You're back.\nHave you reconsidered my offer?");
    }
    public void showScene2()
    {
        jq.ui.bgPanel[1].setVisible(false);
        jq.ui.bgPanel[2].setVisible(true);	
	jq.ui.bgPanel[3].setVisible(false);
        jq.ui.messageText.setText("As you enter deeper into the woods, the\ntrees become thicker and the forest darker.");
    }
    /*public void showHutInterior()
    {   
        
        jq.ui.bgPanel[2].setVisible(false);
	jq.ui.bgPanel[3].setVisible(true);
        jq.ui.messageText.setText("The inside of the house is dark.\nYou feel uneasy.");
    }*/
    public void showScene3()
    {
        jq.ui.bgPanel[2].setVisible(false);
	jq.ui.bgPanel[3].setVisible(true);	
        jq.ui.messageText.setText("The cave is dark but you can see a monster\nwaiting for you.");
    }
    public void showGameOverScreen(int currentBgNum)
    {
        //jq.ui.bgLabel[3].setVisible(false);
        //jq.ui.bgPanel[1].setVisible(false);
        //jq.ui.bgPanel[2].setVisible(false);
        jq.ui.bgPanel[currentBgNum].setVisible(false);
        jq.ui.titleLabel.setVisible(true);
        jq.ui.titleLabel.setText("YOU DIED");
        jq.ui.restartButton.setVisible(true);
        jq.ui.restartButton.setText("Restart?");
    }
    public void existGameOverScreen()
    {
        jq.ui.titleLabel.setVisible(false);
        jq.ui.restartButton.setVisible(false);
        jq.player.setPlayerDefaultStatus();
        jq.ev3.monsterLife = 5;
    }
    
}
