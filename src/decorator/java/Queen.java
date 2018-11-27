package decorator.java;

/**
 * Queen class, capable of generating additional bees. 
 */
public class Queen extends BeeDecorator {

    public Queen(Bee b) {
        super(b); 
    }
    
    public void hatch() {
        super.hatch(); 
        System.out.println("Becomes queen.");
    }
    
    /**
     * Method for queen to produce additional bees. 
     * @return the newly created bee
     */
    public Larva layEgg() {
        System.out.println("Laying egg.");
        Larva newEgg = new Larva(); 
        return newEgg; 
    }
}