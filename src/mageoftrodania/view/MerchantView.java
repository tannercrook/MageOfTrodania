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
public class MerchantView extends View {
    
    public MerchantView() {
        super("Welcome to my shop!\n"
                + "B - Buy\n"
                + "S - Sell\n"
                + "E - Exit the shop");
    }
    
    @Override
    public void presentView() {
        boolean working = true;
        while (working) {
            char choice = this.getInput();
            switch (choice) {
                case 'B':
                    this.buying();
                    working = false;
                    break;
                case 'S':
                    this.selling();
                    working = false;
                    break;
                case 'E':
                    this.exit();
                    working = false;
                    break;
                default:
                    System.out.println("You did not select a valid option.");
                    break;
            }
        }
    }
    
    
    private void buying() {
        
    }
    
    private void selling() {
        
    }
    
    private void exit() {
        
    }
    
}
