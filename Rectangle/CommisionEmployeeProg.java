public class CommisionEmployeeProg {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("panos", "papio", "123123", 200, 0.5);
        System.out.printf("sales: %.2f", employee.getGrossSales());
        System.out.printf("\ncommission rate: %.2f", employee.getCommissionRate());
        System.out.printf("\ntotal: %.2f", employee.earnings());
    }
}
