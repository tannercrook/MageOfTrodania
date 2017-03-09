/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mageoftrodania.model;

/**
 *
 * @author tacrook
 */
public class Inventory {
    
    // Inventory Size
    int size = 8;
    int capacity = 0;
    
    // Items
    Item[] items = new Item[this.size];
    
    
    
    public Inventory() {
        
    }
    
    
    public void print() {
        System.out.println();
        System.out.println();
        System.out.println("Index         Item          Value");
        System.out.println("--------------------------------------");
        if (this.capacity > 0) {
            for (int i = 0; i < this.capacity; i++) {
                System.out.println(i+ "       " + this.items[i].name + "    " + this.items[i].value);
            }
        }
        
        for (int i = 0; i <= this.size - this.capacity - 1; i++) {
            System.out.println("[Empty]");
        }
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println();
    }
    
    public void addItem(Item item) {
        this.items[this.capacity] = item;
        this.capacity = this.capacity + 1;
        System.out.println(item.name + " Added to bag.");
        System.out.println();
    }
    
    public Item getItemAtIndex(int index) {
        return this.items[index];
    }
    
    
    public Weapon equipWeapon(Item weaponToEquip, Weapon currentWeapon, int index) {
        if (weaponToEquip instanceof Weapon ) {
            this.removeItemAtIndex(index);
            System.out.println("You equip " + ((Weapon) weaponToEquip).getName() + ".");
            this.addItem(currentWeapon);
            return (Weapon)weaponToEquip;
        } else {
            System.out.println("That is not a weapon.");
            return currentWeapon;
        }
    }
    
    public void removeItem(String name) {
        int targetItem = 0;
        Item deletedItem = new Item();
        boolean found = false;
        
        // Search for the item in the inventory
        if (found != true) {
            for (int i = 0; i < this.capacity; i++) {
                if (this.items[i].name.equals(name)) {
                    targetItem = i;
                    found = true;
                }
            }
        }
        
        // Store the deleted item
        deletedItem = this.items[targetItem];
        
        // Move the inventory around to delete it
        if (found) {
            for (int i = targetItem; i <= this.capacity; i++) {
                if (i + 1 <= this.capacity) {
                    this.items[i] = this.items[i+1];
                }
            }
            System.out.println(deletedItem.name + " has been removed.");
        }
        else {
            System.out.println("You do not have that item.");
        }   
    }
    
    public void removeItemAtIndex(int index) {
        
        if (index <= this.capacity - 1) {
            Item deleting = this.items[index];
            for (int i = index; i <= this.capacity; i++) {
                if (i+1 <= this.capacity-1) {
                    this.items[i] = this.items[i+1];
                }
            }
            this.capacity = this.capacity - 1;
            System.out.println(deleting.getName() + " has been removed from your bag.");
        } else {
            System.out.println("There is not an item in that slot.");
        }
    }
    
    
    
    private boolean exists(String name) {
        int targetItem = 0;
        boolean found = false;
        
        // Search for the item in the inventory
        if (found != true) {
            for (int i = 0; i <= this.capacity; i++) {
                if (this.items[i].name.equals(name)) {
                    targetItem = i;
                    found = true;
                }
            }
        }
        
        return found;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    
}
