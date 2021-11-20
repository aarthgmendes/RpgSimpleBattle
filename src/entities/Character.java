package entities;

import java.util.Random;

import javax.swing.JOptionPane;

public class Character {
    // ATRIBUTOS DA CLASSE
    // caracteristicas do personagem
    private String name;
    private String classe;
    private String breed;
    private int hp;
    private int level;
    // atributos do personagem
    private int strength;
    private int constitution;
    private int dex;
    private int wisdom;
    
    // CONSTRUTURES DA CLASSE
    public Character(String name, String classe, String breed) {
        Random lifeDice = new Random();
        this.name = name;
        this.classe = classe;
        this.breed = breed;
        level = 1;
        constitution = 5;
        wisdom = 5;

        if (this.classe.equals("Fighter")) {
            hp = ((1 + lifeDice.nextInt(10)) * level) + this.constitution;
        } else {
            hp = ((1 + lifeDice.nextInt(4)) * level) + this.wisdom;
        }  
    }

    // MÉTODOS ESPECÍFICOS
    public void levelUp(int level) {
        Random lifeDice = new Random();
        this.level = level;
// hp = ((1 + lifeDice.nextInt(10)) * level) + this.constitution;
// hp = ((1 + lifeDice.nextInt(4)) * level) + this.wisdom;
        if (this.classe.equals("Fighter")) {
            for(int i = 1; i <= level; i++) {
                int somaHp = 0;
                somaHp = 1 + lifeDice.nextInt(10) + this.constitution;
                hp += somaHp;
            }
        } else {
            for(int i = 1; i <= level; i++) {
                int somaHp = 0;
                somaHp = 1 + lifeDice.nextInt(4) + this.wisdom;
                hp += somaHp;
            }
        }  
    }

    public void showStats() {
        JOptionPane.showMessageDialog(null, "Name: " + name 
        + "\nClasse: " + classe 
        + "\nBreed: " + breed 
        +"\nLevel = " + level 
        + "\nHP = " 
        + hp, "PLAYER INFORMATIONS", JOptionPane.INFORMATION_MESSAGE);

    }

    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClasse() {
        return classe;
    }

    public String getBreed() {
        return breed;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getLevel() {
        return level;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getConstitution() {
        return constitution;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public int getDex() {
        return dex;
    }
    public void setDex(int dex) {
        this.dex = dex;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    
}
