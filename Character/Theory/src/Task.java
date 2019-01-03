// you can experiment here, it won’t be checked

import java.util.*;

class Task {

  public static void main(String[] args) throws InterruptedException {
    // put your code here
/*    Thread thread = new MyThread();
    thread.start();
    thread.join();
    runnable.run();*/
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(1);
    list.add(0);
    Task.getList(list);
    }

  public static List<Integer> getList(List<Integer> list) {
    //Collections.sort(list, (o1, o2) -> o2 - o1);
    Collections.sort(list);
    for (Integer integer : list) {
      System.out.println(integer);
    }
    return list;
  }

  public static void print() {
    System.out.println("This is print method(common).");
  }


  private static Runnable runnable = new Runnable() {
    //private MyThread myThread = new MyThread();

    @Override
    public void run() {
      System.out.println("This is Runnable thread.");
      System.out.println(Thread.currentThread());
      collisionRunnable();
      print();
    }

    private void collisionRunnable() {
      long x = 234567891079890987L;
      System.out.println("This is collisionRunnable method!!");
      x *= x;
      System.out.println(x);
      System.out.println("I'v calculated in collisionRunnable method!!!");
    }
  };
}
/*
class MyThread extends Thread implements Runnable {

  @Override
  public void run() {
    System.out.println("This is MyTread thread.");
    System.out.println(Thread.currentThread());
    collisionMyTread();
    Task.print();
  }

  private void collisionMyTread() {
    long x = 234567891079890987L;
    System.out.println("This is collisionMyTread method!!");
    x *= x;
    System.out.println(x);
    System.out.println("I'v calculated in collisionMyThread method!!!");
  }
}*/
