import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    //put your code here
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(
                    System.in));
    String s = reader.readLine();
    int number = Integer.parseInt(s);
    if (number % 2 == 0) {
      System.out.println(number += 2);
    } else {
      System.out.println(number += 1);
    }
  }
}