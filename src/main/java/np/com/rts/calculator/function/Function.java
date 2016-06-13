package np.com.rts.calculator.function;

/**
 * Created by ruraj on 6/13/16.
 */
public abstract class Function {

  /**
   * This function is going to do calculations on the given numbers according to
   * the class that is in use.
   * @param args Input numbers as double
   * @return Calculated value
   */
  public abstract double calculate(double ... args);

  public abstract double calculateFromFile(String file);

}
