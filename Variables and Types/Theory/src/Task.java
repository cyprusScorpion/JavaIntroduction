// you can experiment here, it won’t be checked

class Task {
  public static void main(String[] args) {
    // put your code here
    /*int coin = (int) (Math.random() * 100 % 2);
    System.out.println(coin);*/
    CheckingAccount chAcc = new CheckingAccount("1",
            3456767L, 0.1);
    SavingAccount svAcc = new SavingAccount("2",
            43876498L, 3.6);
    System.out.println(chAcc.fee);
    System.out.println(svAcc.interestRate);
  }
}

class BankAccount {

  protected String number;
  protected Long balance;

  public BankAccount(String number, Long balance) {
    this.number = number;
    this.balance = balance;
  }
}

class CheckingAccount extends BankAccount {
  protected double fee;

/*  public CheckingAccount (String number,
                          Long balance,
                          double fee) {
    super(number, balance);
    this.fee = fee;
  }*/

  public CheckingAccount(String number, Long balance, double fee) {
    super(number, balance);
    this.fee = fee;
    }
}

class SavingAccount extends BankAccount {
  protected double interestRate;

  public SavingAccount (String number,
                        Long balance,
                        double interestRate) {
    super(number, balance);
    this.interestRate = interestRate;
  }
}
