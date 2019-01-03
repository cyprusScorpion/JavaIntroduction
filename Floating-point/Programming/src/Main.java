import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int distance;
    int hours;
    distance = scanner.nextInt();
    hours = scanner.nextInt();
    float travelTime = (float) hours;
    System.out.println(distance / travelTime);
  }
}