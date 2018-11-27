package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BuilderTest.class, DecoratorTest.class, ObserverTest.class, SingletonTest.class })
public class DesignPatternTestSuite {

}
