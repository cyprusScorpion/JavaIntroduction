// you can experiment here, it won't be checked

class Task {
  public static void main(String[] args) {
    // put your code here
    boolean knowJava = false;
    boolean knowPython = false;
    int yearsOfExperienceInJava = 0;
    int yearsOfExperienceInPython = 0;
    /*
John: knowJava = true; yearsOfExperienceInJava = 1;
     * knowPython = false; yearsOfExperienceInPython = 0;
Mary: knowJava = false; yearsOfExperienceInJava = 0; knowPython = true;
      * yearsOfExperienceInPython = 3;
Olivia: knowJava = true; yearsOfExperienceInJava = 0;
 knowPython = true; yearsOfExperienceInPython = 2;
Alexander: knowJava = true;  yearsOfExperienceInJava = 3;
 knowPython = true; yearsOfExperienceInPython = 2;
Andrew: knowJava = false; yearsOfExperienceInJava = 1;
 knowPython = false; yearsOfExperienceInPython = 1;
Emily: knowJava = false; yearsOfExperienceInJava = 0;
 knowPython = true; yearsOfExperienceInPython = 2;
    * */

    boolean offerAJob =
            (knowJava && yearsOfExperienceInJava >= 1) ||
                    (knowPython && yearsOfExperienceInPython >= 3);
    boolean offerJohn = true && true || false && false;
    System.out.println("John: " + offerJohn);
    boolean offerMary = false && false || true && true;
    System.out.println("Mary: " + offerMary);
    boolean offerOlivia = true && false || true && false;
    System.out.println("Olivia: " + offerOlivia);
    boolean offerAlexander = true && true || true && false;
    System.out.println("Alexander: " + offerAlexander);
    boolean offerAndrew = false && true || false && false;
    System.out.println("Andrew: " + offerAndrew);
    boolean offerEmily = false && false || true && false;
    System.out.println("Emily: " + offerEmily);
  }
}
