import java.util.*;

//The restriction: the class should have the name Main
public class Main {

  //The start point of your program
  public static void main(String[] args) {
    System.out.println("It's compiled!"); //It prints "It's compiled!"
    Date currentTime = new Date();
    long hours = currentTime.getHours();
    int minutes = currentTime.getMinutes();
    int seconds = currentTime.getSeconds();

    System.out.printf("Часов: %d минут: %d секунд: %d",
            hours, minutes, seconds);


  }
}