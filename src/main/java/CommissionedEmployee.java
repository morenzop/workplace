public class CommissionedEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionedEmployee(String firstName, String lastName, double grossSales, double commissionRate) {
        super(firstName, lastName);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }
   @Override
   public String paycheck(){
        return "CommissionedEmployee earned " + grossSales*commissionRate;
    }



    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
