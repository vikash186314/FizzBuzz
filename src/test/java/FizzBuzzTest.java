import fizzbuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Vikash Kumar
 * 22/09/21
 */
public class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzBuzz.evaluate(9));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fizzBuzz.evaluate(25));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }

    @Test
    public void testNumber1() {
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test
    public void testNumber100() {
        assertEquals("Buzz", fizzBuzz.evaluate(100));
    }
}
