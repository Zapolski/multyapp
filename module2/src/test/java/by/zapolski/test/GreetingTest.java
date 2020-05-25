package by.zapolski.test;

import by.zapolski.Greeting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreetingTest {

    private Greeting greeting;

    @Before
    public void setUp(){
        greeting = new Greeting();
    }

    @Test
    public void greetingTest(){
        String expected = "Hello, Serg!";
        String actual = greeting.getGreeting("Serg");
        Assert.assertEquals(expected,actual);
    }
}
