public class BasePlusEmployee extends CommissionedEmployee {

    private double baseSalary;

    public BasePlusEmployee(String firstName, String lastName, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, grossSales, commissionRate);
        this.baseSalary=baseSalary;

    }
    @Override
    public String paycheck(){
        return "BasePlusEmployee earned " + ((getGrossSales()*getCommissionRate())+baseSalary);
    }



    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
