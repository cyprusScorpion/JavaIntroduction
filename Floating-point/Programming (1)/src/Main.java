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
    double realNum = Double.parseDouble(s);
/*    int intNum;
    intNum = (int) realNum;
    System.out.println(intNum);*/
    double fractPart = realNum % 1;
    System.out.println(fractPart);


  }
}