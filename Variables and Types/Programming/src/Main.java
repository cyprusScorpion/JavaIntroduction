import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    //put your code here
    BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
    String[] s = br.readLine().split("\\s+");
    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);
    System.out.println(b + " " + a);
  }
}