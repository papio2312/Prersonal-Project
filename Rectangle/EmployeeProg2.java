public class EmployeeProg2 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2();
        SalesEmployee2 emp2 = new SalesEmployee2("John", "Smith", "2 Somewhere Str", "210 1234567","Accounting", 700.0, 6000.0, 0.1);

        emp1.setFirstName("Anne");
        emp1.setLastName("James");
        emp1.setAddress("5 Somewhere street");
        emp1.setTelephoneNumber("210 9874561");
        emp1.setDepartment("IT");
        emp1.setMonthlySalary(1000.0);

        System.out.printf("Name: %s %s\nAddress: %s\nTelephone: %s \nDepartment: %s\nSalary for this month: %.2f\n",emp1.getFirstName(),emp1.getLastName(),emp1.getAddress(),emp1.getTelephoneNumber(),emp1.getDepartment(),emp1.getMonthlySalary());
        System.out.println();
    

         System.out.printf("Name: %s %s\nAddress: %s\nTelephone: %s \nDepartment: %s\nSalary for this month: %.2f\n",emp2.getFirstName(),emp2.getLastName(),emp2.getAddress(),emp2.getTelephoneNumber(),emp2.getDepartment(),emp2.getTotalMonthlySalary());
        System.out.println();
    }

}
