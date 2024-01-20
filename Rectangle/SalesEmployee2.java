public class SalesEmployee2 extends Employee2 {
   
    private double adMoneyIn;
    private double rate = 0.1;
    private double totalMonthlySalary;

    public SalesEmployee2(){
        super();
        setAdMoneyIn(0.0);
        totalMonthlySalary= getMonthlySalary();
    }

    public SalesEmployee2(String name, String surname, String homeAddress, String tel, String dep, double salary, double adMoney, double commission){
        super(name, surname, homeAddress, tel, dep, salary);
        setAdMoneyIn(adMoney);
        setRate(commission);
        calculateTotalMonthlySalary();
        totalMonthlySalary = getTotalMonthlySalary();
    }

    public void setAdMoneyIn(double adMoney){

        if(adMoney > 0){
            adMoneyIn = adMoney;
        }
    
    else{

        adMoneyIn = 0;
        }
    }

    public double getAdMoneyIn(){

        return adMoneyIn;
    }

    public void calculateTotalMonthlySalary(){
        if((getMonthlySalary() > 0) && (adMoneyIn >=0)){
            totalMonthlySalary = getMonthlySalary() + adMoneyIn * rate;
        } else{
            totalMonthlySalary =0;
        }
    }

    public double getTotalMonthlySalary(){

        return totalMonthlySalary;
    }

    public void setRate(double commission){

        if(commission>0){
            rate = commission;
        }
        else{
            rate = 0;
        }
    }

    public double getRate(){
        return rate;
    }
}
