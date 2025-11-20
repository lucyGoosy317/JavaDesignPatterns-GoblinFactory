package com.factory.goblins;

public abstract class Goblin {

    public int hp;
    public String goblinType;
    public Goblin(String goblinType){
        this.goblinType=goblinType;
    }

    //All non-abstract methods are inherited as they are
    // Non-abstract method
    public int getHP() {        
        return this.hp;
    }

    // Non-abstract method
    public void setHP(int hp) {
        this.hp=hp;   
    }

    //abstract method must be overriden
    public abstract void attack();

    // Non-abstract method
    public void displayStats(){
        System.out.println("Goblin Type: "+this.goblinType);
        System.out.println("Goblin Health points: "+getHP());
        System.out.println("\n");

    }
    
}
