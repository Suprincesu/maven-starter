package np.com.rts.calculator.function;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ruraj on 6/13/16.
 */
public class SumFunctionTest {

  private double[] tenNumbers;

  @Before
  public void setupVariables() {
    tenNumbers = new double[] {
            1, 2.0, 3, 4, 5, 6, 7, 8, 9, 10
    };
  }

  @Test
  public void testSumOfTwoNumbers() {
    // We will try to add two numbers and see if the result if correct

    SumFunction sumFunction = new SumFunction();

    Assert.assertEquals(3.0 + 1.1, sumFunction.calculate(3.0, 1.1), 0.0);
  }

  @Test
  public void sumOf10Numbers() {
    SumFunction sumFunction = new SumFunction();

    Assert.assertEquals( 10 * (10 + 1) /2, sumFunction.calculate(tenNumbers), 0.0);
  }

  @Test
  public void sumNumbersFromFile() {
    SumFunction sumFunction = new SumFunction();

    sumFunction.calculateFromFile( SumFunctionTest.class.getClassLoader().getResource("mock_numbers").getFile() );
  }
}
