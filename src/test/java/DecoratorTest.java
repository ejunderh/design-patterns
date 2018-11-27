package test.java;

import static org.junit.Assert.assertTrue;

import decorator.java.Bee; 
import decorator.java.Drone; 
import decorator.java.Larva;
import decorator.java.Queen;
import decorator.java.Warrior; 
import org.junit.Test;

public class DecoratorTest {

    Queen testQueen = new Queen(new Larva());
    Drone testDrone = new Drone(new Larva()); 
    Warrior testWarrior = new Warrior(new Larva());
    Larva testLarva = new Larva(); 
    
    /**
     * Test of eggLay method for Queen class. 
     */
    @Test
    public void eggLayTest() {
        //purposefully declared as Bee rather than Larva to ensure same type
        Bee newLarva = testQueen.layEgg(); 
        assertTrue(testLarva.getClass().equals(newLarva.getClass()));
    }

}
