/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaquest;

import java.util.HashSet;
import javaquest.Event.Event01;
import javaquest.Event.Event02;

public class JavaQuest {
    
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    public Player player = new Player(this);
    public SceneChanger sChanger = new SceneChanger(this);
    
    public Event01 ev1 = new Event01(this);
    public Event02 ev2 = new Event02(this);
    
    public static void main(String[] args) {
        new JavaQuest();
        System.out.println("Hello");
    }
    
    public JavaQuest(){
        // To call showScene1 when the game starts
        //sChanger.showScene1();
        player.setPlayerDefaultStatus();
        
        
    }
}
