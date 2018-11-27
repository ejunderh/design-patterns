package decorator.java;

/**
 * Decorator class for creating new Bees. 
 * @author ethanunderhill
 *
 */
public class BeeDecorator implements Bee {

    protected Bee bee; 
    
    public BeeDecorator(Bee b) {
        this.bee = b; 
    }
    
    
    public void hatch() {
        this.bee.hatch(); 
    }
}
