// you can experiment here, it won’t be checked

import java.io.*;
import java.util.Scanner;

class Task {
  public static void main(String[] args) throws IOException {
    // put your code here
/*    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int nextInt = scanner.nextInt();
    System.out.println(i + nextInt);*/
//    Scanner scanner = new Scanner(System.in);
//    String s = scanner.nextLine();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strings = br.readLine().split("\\s+");
    int read1 = Integer.parseInt(strings[0]);
    int read2 = Integer.parseInt(strings[1]);
    System.out.println(read1 + read2);
  }
}