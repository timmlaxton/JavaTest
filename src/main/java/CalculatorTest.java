import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(7, calculator.add(2,5), 0.01);

    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(12,2), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(9, calculator.multiply(3,3), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals( 6, calculator.divide(18,3), 0.01);
    }
}


//    Create a Calculator class.
//        This should have functions for Add, Subtract, Multiply and Divide, each taking in two doubles to perform the calculations on.