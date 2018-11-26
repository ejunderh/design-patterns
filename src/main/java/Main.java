package main.java;

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
        
        
    }
}
