package np.com.rts.calculator.function;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 * Created by ruraj on 6/13/16.
 */
public class SumFunction extends Function {
  /**
   * This function is going to do a sum function on the given numbers.
   * @param args Input numbers as double
   * @return Sum of the values
   */
  public double calculate(double... args) {
    return Arrays.stream(args).sum();
  }

  @Override
  public double calculateFromFile(String file) {
    List<String> numberList;
    try {
      numberList = Files.readAllLines(new File(file).toPath());
    } catch (IOException e) {
      e.printStackTrace();
      return 0;
    }

    // map, filter, reduce
    // map = convert one thing to another
    // filter = filter certain things out of a list
    // reduce = get one value calculated from a list

    return numberList.stream().mapToDouble(Double::valueOf).sum();
  }
}
