package mageoftrodania.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mageoftrodania.model.*;
import mageoftrodania.view.*;
/**
 *
 * @author tacrook
 */
public class MageofTrodania {

    
    public static Hero player;
    
    public static void main(String[] args) {
        
        // Create a new character
        player = new Hero();
        
        
        
        player.bag.addItem(new Item("Wood Stick", 5));
        player.bag.addItem(new Item("Small Torch", 30));
        player.bag.addItem(new Staff("Training Staff", 5, "A training staff", 5, 1, 4, 4));
        
        MainMenuView mainMenu = new MainMenuView();
        
        mainMenu.presentView();
        
        
        
        
    }
    
}
