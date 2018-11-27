package decorator.java;

public class BeeDecorator implements Bee {

    protected Bee bee; 
    
    public BeeDecorator(Bee b) {
        this.bee = b; 
    }
    
    
    public void hatch() {
        this.bee.hatch(); 
    }
}
