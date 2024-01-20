public class SalariedEmployee extends Employee{ //salariedemployee class inherits from employee superclass.
    private int salary;

    public SalariedEmployee(){
        super();
        salary = 0;
    }

    //super() gives to salariedemployee the essentials (name and afm).
    public SalariedEmployee(String n, String a,int s){
        super(n,a);
        salary = s;
        setSalary(s);//declaring our set method. 
    }

    //setpayment method
     public void setSalary(int s) {
        if (s > 0) {
            salary = s; 
        }
        else
        {
            salary = 0;
        }
    }

    //payment() returns the salary variable. 
    public int payment() {
        return salary;
    }
}
