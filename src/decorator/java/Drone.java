package decorator.java;

public class Drone extends BeeDecorator {

    public Drone(Bee b) {
        super(b); 
    }
    
    public void hatch() {
        super.hatch(); 
        System.out.println("Becomes drone.");
    }
    
    public void gather() {
        System.out.println("Gathering nectar.");
    }
}
