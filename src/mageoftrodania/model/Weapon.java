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
public class Weapon extends Item {
    
    int damage = 0;
    int durability = 10;
    int level = 1;
    
    public Weapon() {
        super();
        this.damage = 10;
        this.level = 1;
    }
    
    public Weapon(String name, int value, String description, int damage, int durability, int level) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.damage = damage;
        this.durability = durability;
        this.level = level;
    }
    
    
    public void printStats() {
        System.out.println(damage);
        System.out.println(durability);
        System.out.println(level);
    }
    
}
