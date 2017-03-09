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
public class Staff extends Weapon {
    
    int magicalHarm = 0;
    int magicalIntellect = 0;
    
    public Staff() {
        this.damage = 0;
        this.level = 1;
        
        this.magicalHarm = 0;
        this.magicalIntellect = 0;
    }
    
    public Staff(String name, int value, String description, int damage, int level, int magicalHarm, int magicalIntellect) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.damage = damage;
        this.level = level;
        this.magicalHarm = magicalHarm;
        this.magicalIntellect = magicalIntellect;
    }
    
    
    public void printStats() {
        System.out.println(damage);
        System.out.println(durability);
        System.out.println(level);
    }
    
}
