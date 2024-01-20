public class EmployeeAbst {
    
    private String firstName;
    private String secondName;
    private int age;
    private int employeeId;

    public EmployeeAbst (){
        firstName = secondName = null;
        age = 0;
        employeeId = 0;
    }

    public EmployeeAbst (String fn, String sn, int ag, int id){
        firstName = fn;
        secondName = sn;
        age = ag;
        employeeId = id;
    }

    public void setName(String fn, String sn){
        firstName = fn;
        secondName = sn;
    }

    public void displayName(){
        System.out.println(firstName + " " + secondName);
    }

    public int getAge() {
        return age;
    }

    public int getID(){
        return employeeId;
    }

    public void setAge(int ag){
        if(ag>0){
            age = ag;
        }else{
            age = 0;
        }
    }

    public void setId(int id){
        if((id>999) &&(id<1000000)){
            employeeId = id;
        }else{
            employeeId =0;
        }
    }

    public abstract double calculateSalary(); 
}
