package main.java;

import builder.java.Beehive;
import builder.java.Beehive.BeeType;
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
    }
        
        
}

