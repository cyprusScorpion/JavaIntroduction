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
      int hourFirst = Integer.parseInt(s);
      String s1 = reader.readLine();
      int minFirst = Integer.parseInt(s1);
      String s2 = reader.readLine();
      int secFirst = Integer.parseInt(s2);

      String ss = reader.readLine();
      int hourSecond = Integer.parseInt(ss);
      String ss1 = reader.readLine();
      int minSecond = Integer.parseInt(ss1);
      String ss2 = reader.readLine();
      int secSecond = Integer.parseInt(ss2);

      int resultFirst = hourFirst * 3600 +
      minFirst * 60 + secFirst;
      int resultSecond = hourSecond * 3600 +
              minSecond * 60 + secSecond;
      int result = resultSecond - resultFirst;
    System.out.println(result);


  }
}