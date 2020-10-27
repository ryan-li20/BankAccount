public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountId, String passwor){
    balance = 0;
    accountID = accountId;
    password = passwor;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public String toString(){
    String account = "" + accountID;
    String bal = "" + balance;
    return account + "\t" + balance;
  }

  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if(amount >= 0){
      balance += amount;
    }
    else{
      return false;
    }
    return true;
  }

  public boolean withdraw(double amount){
    if(amount >= 0 && amount <= balance){
      balance -= amount;
    }
    else{
      return false;
    }
    return true;
  }

  public String getPassword(){
    return password;
  }

}
