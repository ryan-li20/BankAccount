public class Tester{
  public static void main(String[] args){
    BankAccount first = new BankAccount(513234, "myPassword");
    System.out.println(first.getAccountID());
    System.out.println(first.getBalance());
    System.out.println(first.toString());
    System.out.println(first.getPassword());
    first.setPassword("minePass");
    System.out.println(first.getPassword());
    System.out.println(first.deposit(10));
    System.out.println(first.getBalance());
    System.out.println(first.deposit(-14));
    System.out.println(first.getBalance());
    System.out.println();
    System.out.println(first.withdraw(9));
    System.out.println(first.getBalance());
    System.out.println(first.withdraw(-2));
    System.out.println(first.getBalance());
    System.out.println(first.withdraw(3));
    System.out.println(first.getBalance());
    System.out.println(first.toString());
  }
}
