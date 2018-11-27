package observer.java;

/**
 * Bees that monitor the status of the queen. 
 * @author ethanunderhill
 *
 */
public class Defender implements Observer {

    private Observable observable = null; 
    
    public Defender(Observable observable) {
        this.observable = observable; 
    }
    
    public void update() {
        defendQueen(); 
    }
    
    public void defendQueen() {
        System.out.println("Defender returning to Queen.");
    }
}
