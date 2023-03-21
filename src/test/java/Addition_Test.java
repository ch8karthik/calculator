
import org.junit.*;
import static org.junit.Assert.*;

public class Addition_Test{

    @BeforeClass
    public static void before_test() {
        System.out.println("starting addition test");
    }

    @Test
    public void positive_and_positive() {
        Calculator mycalc = new Calculator();
        System.out.println("test 1) Adding +ve and +ve integer numbers");
        assertEquals("addition of 3.5 and 1.5 is not working correctly",5,mycalc.add(3.5f, 1.5f),0.00001);
    }

}
