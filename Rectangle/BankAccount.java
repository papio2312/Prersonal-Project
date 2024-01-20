public class BankAccount {
     double balance;

     public BankAccount(){
        balance = 0;
     }

     public void deposit(double amount){
        double newBalance = balance + amount;
        balance = newBalance;
     }


     public void withdraw(double amount){
        double newBalance = balance - amount;
        balance = newBalance;
     }

     public double getBalance(){
        return balance;
     }
}
