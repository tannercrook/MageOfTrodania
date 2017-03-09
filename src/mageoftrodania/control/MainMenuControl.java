/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mageoftrodania.control;

/**
 *
 * @author tacrook
 */
import static mageoftrodania.control.MageofTrodania.player;


public class MainMenuControl {
    
    public MainMenuControl() {
        
    }
   
    
    public void getCharacter() {
        player.printStats();
    }
    
    
}
