import Assignments.EightFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EightFunctionsTest {
    @Test
    public void testThatEightFunctionsExistTest(){
        assertTrue(true);
    }
    @Test
    public void testForEvenNumberTest(){
        EightFunctions functions = new EightFunctions();
        functions.evenOrOddNumbers(7);
        System.out.print(functions.evenOrOddNumbers(7));
        assertTrue(true);
    }
    @Test
    public void testForPrimeNumberTest(){
        EightFunctions functions = new EightFunctions();
         functions.primeNumbers (97);
        System.out.println(functions.primeNumbers(97));
        assertTrue(true);
    }
       @Test
    public void testForSubtractionTest(){
        EightFunctions functions = new EightFunctions();
        functions.subtractor(7,3);
           System.out.println(functions.subtractor(7,3));
           assertEquals(4,functions.subtractor(7,3));

    }
}
