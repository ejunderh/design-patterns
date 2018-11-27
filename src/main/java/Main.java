package main.java;

import builder.java.Beehive;
import builder.java.Beehive.BeeType;
import decorator.java.Bee;  
import decorator.java.Larva;
import decorator.java.Queen; 
import decorator.java.Warrior;
import observer.java.Defender;
import observer.java.QueenBee;
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
        System.out.println("Singleton demo" + "\n----------");
        Apiary temp = Apiary.getInstance(); 
        temp.addHive(); 
        
        //Beehive (builder) demo
        System.out.println("\nBuilder demo" + "\n----------");
        Beehive sampleHive = new Beehive.Builder(BeeType.KILLER) 
            .withRooms(10)
            .withWorkers(20)
            .withWarriors(5)
            .build(); 
        
        System.out.println("\n" + sampleHive.toString()); 
        
        //Bee creation (decorator) demo
        System.out.println("\nDecorator demo" + "\n----------");
        Bee queen = new Queen(new Larva()); 
        queen.hatch(); 
        
        System.out.println("");
        Warrior warrior = new Warrior(new Larva());
        warrior.hatch(); 
        warrior.battle(); 
        
        //Queen defense (observer) demo 
        System.out.println("\nObserver demo" + "\n----------");
        QueenBee dangerQueen = new QueenBee(); 
        Defender guardbee1 = new Defender(dangerQueen); 
        Defender guardbee2 = new Defender(dangerQueen); 
        System.out.println("Queen safe: " + dangerQueen.isSafe());
        dangerQueen.addObserver(guardbee1);
        dangerQueen.addObserver(guardbee2);
        System.out.println("Number of defenders: " + dangerQueen.getNumberOfDefenders()); 
        dangerQueen.setStatus(false);
    }       
}

