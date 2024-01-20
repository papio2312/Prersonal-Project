public class CashRegisterProg {
    public static void main(String[] args) {
        CashRegister item = new CashRegister();

        item.recordPurchase(1000);
        item.enterPayment(1100);

        System.out.printf("Here's your change: %.2f euros", item.getBalance());
    }
}
