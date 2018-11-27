package observer.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Queen class, which will notify defenders if attacked. 
 * @author ethanunderhill
 *
 */
public class QueenBee implements Observable {
    
    // list of notified defenders
    private ArrayList<Observer> defenders = new ArrayList<Observer>(); 
    
    // status of queen 
    private boolean safe = true; 
    
    // getter method for queen status
    public boolean isSafe() {
        return safe; 
    }
    
    /**
     * Sets the status of the queen bee. 
     * @param safe the status of the queen 
     */
    public void setStatus(boolean safe) {
        this.safe = safe;
        if (safe == true) {
            System.out.println("Queen is safe.");
        } else {
            System.out.println("Queen in danger!");
            notifyObserver();
        }
    }
    
    public int getNumberOfDefenders() {
        return defenders.size();
    }
   
    public void addObserver(Observer o) {
        defenders.add(o); 
    }
    
    public void removeObserver(Observer o) {
        defenders.remove(o); 
    }
    
    /**
     * Notifies defenders of queen danger. 
     */
    public void notifyObserver() {
        for (Observer defender: defenders) {
            defender.update(); 
        }
    }
}
