package decorator.java;

public class Queen extends BeeDecorator {

    public Queen(Bee b) {
        super(b); 
    }
    
    public void hatch() {
        super.hatch(); 
        System.out.println("Becomes queen.");
    }
    
    public Larva layEgg() {
        System.out.println("Laying egg.");
        Larva newEgg = new Larva(); 
        return newEgg; 
    }
}