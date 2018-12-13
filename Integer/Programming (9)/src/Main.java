import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    //put your code here
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    int[] numbers = new int[3];
    for (int i = 0; i < numbers.length; i++) {
      int number = numbers[i];
      String s = reader.readLine();
      numbers[i] = Integer.parseInt(s);
      if (numbers[i] < 1 || numbers[i] > 1000) {
        break;
      }
    }
    double sum = 0;
    for (int number : numbers) {
      double n = (double) number / 2;
      sum += Math.ceil(n);
    }
    System.out.println((int) sum);
  }
}
