// you can experiment here, it won’t be checked

class Task {

  private Integer x = 7;

  public static void main(String[] args) {
    // put your code here
    Task task = new Task();

    int xIncrement = task.getX();
/*    System.out.println(xIncrement);
    System.out.println(5e-3);
    float f = 0.888888888888888888f; // a value with a lot of decimal digits
    System.out.println(f);*/
    System.out.println(Float.SIZE);
    System.out.println(Byte.SIZE);
    System.out.println(Float.MAX_EXPONENT);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

  }

  public int getX() {
    return setX(x);
  }

  public int setX(Integer x) {
    x++;
    return x;
  }

}
