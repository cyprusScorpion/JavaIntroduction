import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    double H = scanner.nextInt();
    double A = scanner.nextInt();
    double B = scanner.nextInt();
    double numbersOfDays = Math.ceil(
            (H - B) / (A - B));
    System.out.println((int) numbersOfDays);
  }
}