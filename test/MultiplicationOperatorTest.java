import ClassWork.MultiplicationOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MultiplicationOperatorTest {
    @Test
    public void testThatMultiplicationOperatorExist(){
        MultiplicationOperator multiply = new MultiplicationOperator();
        assertNotNull(multiply);
    }
    @Test
    public void testThatMultiplicationOperatorWorksTest(){
        MultiplicationOperator operator = new MultiplicationOperator ();
     operator.product(2,2);
        System.out.println(MultiplicationOperator.product(2,2));
        assertEquals(4,MultiplicationOperator.product(2,2));
    }
}
