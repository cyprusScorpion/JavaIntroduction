import java.io.*;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {

  public static void main(String[] args) throws IOException {
    //put your code here
/*    Scanner scanner = new Scanner(System.in);
    short N = scanner.nextShort();
    short K = scanner.nextShort();

    System.out.println(K % N);*/
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    String s = bufferedReader.readLine();
    String nAge = bufferedReader.readLine();
    int x = Integer.parseInt(nAge);
    int y = Integer.parseInt(s);

    System.out.println("y + x = " + (y + x));
    bufferedReader.close();
  }
}