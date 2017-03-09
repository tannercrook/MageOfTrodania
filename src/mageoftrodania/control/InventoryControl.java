/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mageoftrodania.control;

import static mageoftrodania.control.MageofTrodania.player;

/**
 *
 * @author tacrook
 */
public class InventoryControl {
    
    MageofTrodania mainControl = new MageofTrodania();
    
    public InventoryControl() {
        
    }
    
    public void listInventory() {
        // print the new player's inventory
        player.bag.print();
    }
    
    public void viewItem(int index) {
        player.bag.getItemAtIndex(index).print();
    }
    
    
    public void equipWeapon(int index) {
        player.equipWeaponAtIndex(index);
    }
    
    public void dropItem(int index) {
        player.bag.removeItemAtIndex(index);
    }
    
}
