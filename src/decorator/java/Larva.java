package decorator.java;

/**
 * Basic bee type from which others descend. 
 * @author ethanunderhill
 *
 */
public class Larva implements Bee {

    public void hatch() {
        System.out.println("Hatched larva.");
    }
}
