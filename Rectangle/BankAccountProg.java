public class BankAccountProg {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();

        myBankAccount.deposit(1500);

        System.out.print("Money deposited: " + myBankAccount.getBalance());
    }
}
