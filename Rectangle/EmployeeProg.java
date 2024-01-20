public class EmployeeProg {
    public static void main(String[] args) {
        //object variables declared.
        SalariedEmployee se = new SalariedEmployee("John", "1010", 2000);
        HourlyEmployee he = new HourlyEmployee("Mary", "3020", 8, 10);

        //manually setting up each employee's info.
        System.out.println("Salaried Employee Info: ");
        System.out.println("-----------------------");
        System.out.println("Name: "+ se.getName());
        System.out.println("AFM: " + se.getAfm());
        System.out.println("Monthly salary: " +se.payment()+" euros");

        System.out.println("Hourly Employee Info: ");
        System.out.println("-----------------------");
        System.out.println("Name: "+ he.getName());
        System.out.println("AFM: " + he.getAfm());
        System.out.println("Hours worked: "+he.getHoursWorked());
        System.out.println("Hourly payment: "+he.getHourlyPayment()+" euros");
        System.out.println("Total payment: " +he.payment()+" euros"); 
        
        
        Employee[] employee = new Employee[2]; //object variable employee declared.

        //subclassses stored as superclass' variables in an array.
        employee[0] = se;
        employee[1] = he;


        //polymorphism. Looping for the two instances: Salaried employee and hourlyEmployee.
        for(Employee currentEmployee: employee){
            System.out.println("AFM: "+ currentEmployee.getAfm());

           //currentemployee takes info from salariedemployee.
            if(currentEmployee instanceof SalariedEmployee){
                SalariedEmployee salariedemployee =(SalariedEmployee)currentEmployee;
                System.out.println("Salary: "+salariedemployee.payment());
            }
            //currentemployee takes info from hourlyemployee.
            if(currentEmployee instanceof HourlyEmployee){
                HourlyEmployee hourlyemployee =(HourlyEmployee)currentEmployee;
                System.out.println("Salary: "+hourlyemployee.payment());
            }
            //printing the type of employee(salaried or hourly) with getClasd()  and payment from currrentEmployee.payment().
            System.out.printf("Employee is a %s and is paid: %d euros\n",currentEmployee.getClass().getName(), currentEmployee.payment());
        }

    }
}
