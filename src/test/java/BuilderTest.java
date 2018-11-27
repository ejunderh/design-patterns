package test.java;

import static org.junit.Assert.assertTrue;

import builder.java.Beehive;
import builder.java.Beehive.BeeType;
import org.junit.Test;


public class BuilderTest {

    Beehive testHive = new Beehive.Builder(BeeType.HONEY) 
            .withRooms(10)
            .withWorkers(10)
            .withWarriors(5)
            .build();
    
    /**
     * Test for getter method checking bee type. 
     */
    @Test
    public void getTypeTest() {
        BeeType testType = testHive.getBeeType();
        assertTrue(testType == BeeType.HONEY);
    }

    /**
     * Test for checking number of rooms, including after modification.
     */
    @Test
    public void getRoomsTest() {
        int initialRooms = testHive.getRooms();
        assertTrue(initialRooms == 10); 
        testHive.setRooms(15); 
        int newRooms = testHive.getRooms(); 
        assertTrue(newRooms == 15); 
    }
    
    /**
     * Test for checking number of workers. 
     */
    @Test
    public void getWorkersTest() {
        int testWorkers = testHive.getWorkers(); 
        assertTrue(testWorkers == 10); 
    }
    
    /**
     * Test for checking number of warriors. 
     */
    @Test
    public void getWarriorsTest() {
        int testWarriors = testHive.getWarriors(); 
        assertTrue(testWarriors == 5); 
    }
}
