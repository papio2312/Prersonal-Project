public class HourlyEmployee extends Employee{//hourlyemployee class inherits from employee superclass.
    private int hoursWorked;
    private int hourlyPaytment;

    public HourlyEmployee(){
        super();
        hoursWorked = 0;
        hourlyPaytment = 0;
    }

    //HourlyEmplyee inherits the name and afm variables from Employee.
    public HourlyEmployee(String n, String a, int hw, int hp){
        super(n,a);
        hoursWorked = hw;
        hourlyPaytment = hp;
        setHoursWorked(hw);
        setHourlyPayment(hp);
    }


    //set & get methods for hoursworked and hourlypayment.
    public void setHoursWorked(int hw){
        if(hw >= 8){
        hoursWorked = hw;
    } else{
        hoursWorked = 0;
    }
        }
        
    public int getHoursWorked(){
        return hoursWorked;
    }

    public void setHourlyPayment(int hp){
        if(hp>0){
        hourlyPaytment = hp;
        } 
        else{
            hourlyPaytment =0;
        }
    }

    public int getHourlyPayment(){
        return hourlyPaytment;
    }

    //payment() returns the product of hoursworked and hourlypayment. 
    public int payment(){
        return hoursWorked * hourlyPaytment;
    }



}
