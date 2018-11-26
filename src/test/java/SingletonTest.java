package test.java;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import singleton.java.Apiary; 

public class SingletonTest {

    Apiary test = Apiary.getInstance(); 
    Apiary test2 = Apiary.getInstance(); 
    
    @Test
    public void methodTest() {
        assertSame(test, test2); 
    }

}
