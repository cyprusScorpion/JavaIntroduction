import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    //put your code here
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    String s = reader.readLine();
    double X = Double.parseDouble(s);
    int x = (int) (X % 1 * 100 / 10);
    System.out.println(x);
  }
}