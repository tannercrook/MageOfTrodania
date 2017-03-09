/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mageoftrodania.model;

import java.util.Scanner;
/**
 *
 * @author tacrook
 */
public class Hero {
    
    // Generic Information
    String firstName = "Hero";
    String lastName = "Hero";
    String title = "The Recruit";
    int level = 1;
    int xp = 0;
    
    // Real Time Resources
    int health = 25;
    int mana = 25;
    
    // Resources Stats (increases by 10)
    int maxHealth = 25;
    int maxMana = 25;
    // (increases by 2)
    int healthRecovery = 3;
    int manaRecovery = 3;
    
    // Combat Stats (increases by 5)
    int spellPower = 10;
    int spellWard = 10; 
    
    
    // Bag
    public Inventory bag = new Inventory();
    
    // Weapon
    private Weapon equippedWeapon = new Weapon("Brass Knuckles", 0, "Your hands", 1, 50, 1);
    
    
    
    // Constructors
    // ===============================
    public Hero() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your character's first name: ");
        this.firstName = input.nextLine();
        System.out.print("Enter your character's last name: ");
        this.lastName = input.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Your new character:");
        this.printStats();
        this.bag = new Inventory();
    }
    
    public Hero(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bag = new Inventory();
    }
    // ================================
    
    
    // Custom Methods
    // ================================
    public void levelUp() {
        System.out.println("LEVEL UP");
        boolean decisionMade = false;
        for (int i = 1; i <= 2; i++) {
            decisionMade = false;
            while (decisionMade != true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Type the skill of your skill (" + i + " of 2) to level (type help for options): ");
                String skillOne = input.nextLine();
                switch (skillOne) {
                    case "help":
                        System.out.println("Options: MaxHealth,MaxMana,HealthRegen,ManaRegen,SpellPower,SpellWard");
                        break;
                    case "MaxHealth":
                        System.out.println("Your old max health was: " + this.getMaxHealth());
                        this.setMaxHealth(this.getMaxHealth() + 10);
                        System.out.println("Your new max health is: " + this.getMaxHealth());
                        decisionMade = true;
                        break;
                    case "MaxMana":
                        System.out.println("Your old max mana was: " + this.getMaxMana());
                        this.setMaxMana(this.getMaxMana() + 10);
                        System.out.println("Your new max mana is: " + this.getMaxMana());
                        decisionMade = true;
                        break;
                    case "HealthRegen":
                        System.out.println("Your old health regen was: " + this.getHealthRecovery());
                        this.setHealthRecovery(this.getHealthRecovery() + 2);
                        System.out.println("Your new health regen is: " + this.getHealthRecovery());
                        decisionMade = true;
                        break;
                    case "ManaRegen":
                        System.out.println("Your old mana regen was: " + this.getManaRecovery());
                        this.setManaRecovery(this.getManaRecovery() + 2);
                        System.out.println("Your new mana regen is: " + this.getManaRecovery());
                        decisionMade = true;
                        break;
                    case "SpellPower":
                        System.out.println("Your old spell power was: " + this.getSpellPower());
                        this.setSpellPower(this.getSpellPower() + 5);
                        System.out.println("Your new spell power is: " + this.getSpellPower());
                        decisionMade = true;
                        break;
                    case "SpellWard":
                        System.out.println("Your old spell ward was: " + this.getSpellWard());
                        this.setSpellWard(this.getSpellWard() + 5);
                        System.out.println("Your new spell ward is: " + this.getSpellWard());
                        decisionMade = true;
                        break;
                }
            }
        }
    }
    
    
    
    public void printStats() {
        System.out.println();
        System.out.println();
        System.out.println(this.getFirstName() + " " + this.getLastName());
        System.out.println("-----------------------------------------");
        System.out.println("Health: " + this.getHealth() + " / "  + this.getMaxHealth());
        System.out.println("Mana: " + this.getMana() + " / "  + this.getMaxMana());
        System.out.println("Spell Power: " + this.getSpellPower() + "     Spell Ward: " + this.getSpellWard());
        System.out.println("-----------------------------------------");
    }
    
    
    
    
    // ================================
    
    
    
    
    
    
    
    
    
    
    
    // Getters
    // ================================

    public int getLevel() {
        return level;
    }
    public int getXP() {
        return xp;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getTitle() {
        return title;
    }
    public int getHealth() {
        return health;
    }
    public int getMana() {
        return mana;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getMaxMana() {
        return maxMana;
    }
    public int getHealthRecovery() {
        return healthRecovery;
    }
    public int getManaRecovery() {
        return manaRecovery;
    }
    public int getSpellPower() {
        return spellPower;
    }
    public int getSpellWard() {
        return spellWard;
    }
    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }
    // ================================
    
    
    
    
    
    
    
    
    
    // Setters
    // ================================

    public void setLevel(int level) {
        this.level = level;
    }
    public void setXP(int xp) {
        this.xp = xp;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }
    public void setHealthRecovery(int healthRecovery) {
        this.healthRecovery = healthRecovery;
    }
    public void setManaRecovery(int manaRecovery) {
        this.manaRecovery = manaRecovery;
    }
    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
    public void setSpellWard(int spellWard) {
        this.spellWard = spellWard;
    }
    public void equipWeaponAtIndex(int index) {
        Item weaponToEquip = this.bag.getItemAtIndex(index);
        this.equippedWeapon = this.bag.equipWeapon(weaponToEquip, this.equippedWeapon, index);
    }
    // ================================
    
    
    
    
    
    
    
    
    
    
    
    
}


