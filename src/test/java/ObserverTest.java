package test.java;

import static org.junit.Assert.assertTrue;

import observer.java.Defender; 
import observer.java.QueenBee; 
import org.junit.Test;

public class ObserverTest {

    QueenBee testQueen = new QueenBee(); 
    Defender testGuard = new Defender(testQueen); 
    Defender testGuard2 = new Defender(testQueen); 
    
    /**
     * Test that queen is istantiated with safe condition. 
     */
    @Test
    public void defaultStatusTest() {
        boolean defaultState = testQueen.isSafe(); 
        assertTrue(defaultState == true);
    }

    /**
     * Test that state of queen is properly updated. 
     */
    @Test
    public void setStateTest() {
        testQueen.setStatus(false);
        boolean newState = testQueen.isSafe(); 
        assertTrue(newState == false); 
    }
    
    /**
     * Test that defenders are added properly as observers.
     */
    @Test 
    public void defenderAddTest() {
        testQueen.addObserver(testGuard);
        testQueen.addObserver(testGuard2);
        assertTrue(testQueen.getNumberOfDefenders() == 2);
        testQueen.removeObserver(testGuard2);
        assertTrue(testQueen.getNumberOfDefenders() == 1); 
    }
}
