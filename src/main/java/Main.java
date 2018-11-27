package main.java;

import builder.java.Beehive;
import builder.java.Beehive.BeeType;
import decorator.java.Bee; 
import decorator.java.BeeDecorator; 
import decorator.java.Drone; 
import decorator.java.Larva;
import decorator.java.Queen; 
import decorator.java.Warrior; 
import singleton.java.Apiary; 

/**
 * Entry point for demonstrating different design patterns. 
 * @author ethanunderhill
 *
 */
public class Main {

    /**
     * Provides demo of different design patterns. 
     * @param args the generic args
     */
    public static void main(String[] args) {
        // Apiary (singleton) demo 
        Apiary temp = Apiary.getInstance(); 
        temp.addHive(); 
        
        //Beehive (builder) demo
        Beehive sampleHive = new Beehive.Builder(BeeType.KILLER) 
            .withRooms(10)
            .withWorkers(20)
            .withWarriors(5)
            .build(); 
        
        System.out.println("\n" + sampleHive.toString()); 
        
        //Bee creation (decorator) demo
        Bee queen = new Queen(new Larva()); 
        queen.hatch(); 
        
        System.out.println("\n");
        Warrior warrior = new Warrior(new Larva());
        warrior.hatch(); 
        warrior.battle(); 
    }
    
        
        
}

