package builder.java;

/**
 * Used for generating beehives. 
 * @author ethanunderhill
 *
 */
public class Beehive {
   
    public enum BeeType { KILLER, BUMBLE, CARPENTER, HONEY } 
    
    private  BeeType beeType;  
    private  int startingRooms; 
    private  int startingWorkers; 
    private  int startingWarriors; 
    
    /**
     * Builder pattern for instantiating beehives. 
     * @author ethanunderhill
     *
     */
    public static class Builder { 
        
        private  BeeType beeType;  
        private  int startingRooms; 
        private  int startingWorkers; 
        private  int startingWarriors; 
        
        public Builder(BeeType beeType) {
            this.beeType = beeType; 
        }
        
        public Builder withRooms(int startingRooms) {
            this.startingRooms = startingRooms; 
            return this; 
        }
        
        public Builder withWorkers(int startingWorkers) {
            this.startingWorkers = startingWorkers; 
            return this; 
        }
        
        public Builder withWarriors(int startingWarriors) { 
            this.startingWarriors = startingWarriors; 
            return this; 
        }
        
        /**
         * Creates a new beehive using the builder pattern.  
         */
        public Beehive build() { 
            Beehive hive = new Beehive(); 
            hive.beeType = this.beeType; 
            hive.startingRooms = this.startingRooms; 
            hive.startingWorkers = this.startingWorkers; 
            hive.startingWarriors = this.startingWarriors; 
            
            return hive; 
            
        }

    } 
    
    /**
     * Private constructor, utilized in builder pattern. 
     */
    private Beehive() {
        
    }
    
    //getters 
    public BeeType getBeeType() { 
        return this.beeType; 
    }
    
    public int getRooms() { 
        return this.startingRooms; 
    }
    
    public int getWorkers() {
        return this.startingWorkers; 
    }
    
    public int getWarriors() { 
        return this.startingWarriors; 
    }
    
    //setter (one included for brevity, others would follow same pattern)
    public Beehive setRooms(int startingRooms) {
        this.startingRooms = startingRooms; 
        return this; 
    }
    
    @Override
    public String toString() {
        return String.format("Bee Type:\t%s\nRooms:\t\t%d\nWorkers:\t%d\nWarriors:\t%d\n", 
                beeType, startingRooms, startingWorkers, startingWarriors); 
    }
    
}
