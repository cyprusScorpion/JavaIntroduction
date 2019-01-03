import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    //put your code here
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    String s = reader.readLine();
    double x = Double.parseDouble(s);
    System.out.print(Math.pow(x, 3) + Math.pow(x, 2) + x + 1);
  }
}