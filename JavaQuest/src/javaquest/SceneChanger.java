/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquest;

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
        jq.ui.bgLabel[2].setVisible(false);
        jq.ui.bgLabel[3].setVisible(false);
        jq.ui.messageText.setText("Oh? You're back.\nHave you reconsidered my offer?");
    }
    public void showScene2()
    {
        jq.ui.bgPanel[1].setVisible(false);
        jq.ui.bgLabel[2].setVisible(true);
        jq.ui.bgLabel[3].setVisible(false);
        jq.ui.messageText.setText("As you enter deeper into the woods, the\ntrees become thicker and the forest darker.");
    }
    public void showHutInterior()
    {
        jq.ui.bgPanel[1].setVisible(false);
        jq.ui.bgLabel[2].setVisible(false);
        jq.ui.bgLabel[3].setVisible(true);
        jq.ui.messageText.setText("The inside of the house is dark.\nYou feel uneasy.");
    }
    
}
