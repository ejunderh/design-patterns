package decorator.java;

/**
 * Class for creating drone-type bees. 
 * @author ethanunderhill
 *
 */
public class Drone extends BeeDecorator {

    public Drone(Bee b) {
        super(b); 
    }
    
    public void hatch() {
        super.hatch(); 
        System.out.println("Becomes drone.");
    }
    
    /**
     * Unique drone method for gathering nectar. 
     */
    public void gather() {
        System.out.println("Gathering nectar.");
    }
}
