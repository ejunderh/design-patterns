package singleton.java;

/**
 * Singleton class for creating the apiary. 
 * @author ethanunderhill
 *
 */
public class Apiary {
    
    private static final Apiary INSTANCE = new Apiary(); 
    
    /**
     * Private constructor to avoid creating multiple instances. 
     */
    private Apiary() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Instance already exists."); 
        }
    }
    
    /**
     * Public accessor for the one Apiary instance allowed. 
     * @return INSTANCE, the only allowable instance of the class. 
     */
    public static Apiary getInstance() {
        return INSTANCE; 
    }
    
    /**
     * Placeholder method for adding hive objects to apiary. 
     */
    public static void addHive() {
        System.out.println("Hive added to apiary.");
    }
}
