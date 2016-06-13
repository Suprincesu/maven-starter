package np.com.rts.calculator;

import np.com.rts.calculator.function.SumFunction;

import java.util.Scanner;

/**
 * Created by ruraj on 6/13/16.
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();    //5\n
    scanner.nextLine();

    double[] inputs = new double[n];

    for (int i=0; i<n; i++) {
      inputs[i] = Double.parseDouble( scanner.nextLine() );
    }

    System.out.println("Your sum is: " + new SumFunction().calculate(inputs));
  }
}
