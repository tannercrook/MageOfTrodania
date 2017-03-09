/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mageoftrodania.view;

/**
 *
 * @author tacrook
 */
import mageoftrodania.control.MainMenuControl;


public class MainMenuView extends View {
    
    private MainMenuControl control = new MainMenuControl();
    
    public MainMenuView() {
        super("\n\nMain Menu\n"
                + "=================\n"
                + "T - Travel\n"
                + "C - View character\n"
                + "I - Inventory\n"
                + "H - Help\n"
                + "Q - Quit\n\n");
    }
    
    @Override
    public void presentView() {
        boolean working = true;
        while (working) {
            char choice = this.getInput();
            switch (choice) {
                case 'T':
                    this.travel();
                    break;
                case 'C':
                    this.character();
                    break;
                case 'I':
                    this.inventory();
                    break;
                case 'H':
                    this.help();
                    break;
                case 'Q':
                    working = false;
                    break;
                default:
                    System.out.println("You did not select a valid option.");
                    break;
            }
        }
    }
    
    
    private void travel() {
        
    }
    
    private void character() {
        this.control.getCharacter();
    }
    
    private void inventory() {
        InventoryView invView = new InventoryView();
        invView.presentView();
    }
    
    private void help() {
        
    }
    
    private void quit() {
        
    }
    
}
