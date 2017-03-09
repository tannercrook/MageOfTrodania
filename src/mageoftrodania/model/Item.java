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
public class Item {
    
    // General
    int itemID = 0;
    protected String name = "An Item";
    int value = 0;
    String description = "A beautiful item glowing with itemness.";
    String type = "MISC";
    
    public Item() {
        this.itemID = 0;
        this.name = "An Item";
        this.value = 0;
        this.description = "A beautiful item glowing with itemness.";
        this.type = "MISC";
    }
    
    public Item(int itemID, String name, int value, String description, String type) {
        this.itemID = itemID;
        this.name = name;
        this.value = value;
        this.description = description;
        this.type = type;
    }
    
    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    
    
    public void print() {
        System.out.println();
        System.out.println();
        System.out.println(this.name);
        System.out.println("----------------------");
        System.out.println(this.description);
        System.out.println("Value: " + this.value + "    Type: " + this.type);
        System.out.println("----------------------");
        System.out.println();
        System.out.println();
    }
    
    
    public void setDetails(String name, int value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
