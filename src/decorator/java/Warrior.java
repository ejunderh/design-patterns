package decorator.java;

public class Warrior extends BeeDecorator {

    public Warrior(Bee b) {
        super(b); 
    }
    
    public void hatch() {
        super.hatch(); 
        System.out.println("Becomes warrior.");
    }
    
    public void battle() {
        System.out.println("Battling another bee.");
    }
}
