public class CashRegister {
    double purchase;
    double payment;

    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount){
        double newPurchase = purchase + amount;
        purchase = newPurchase;
    }

    
    public void enterPayment(double amount){
        double newPayment = payment + amount;
       payment = newPayment;
    }

    public double getBalance(){
        return payment - purchase;
    }
}
