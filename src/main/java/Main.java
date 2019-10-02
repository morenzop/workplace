import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee("Mike", "Jones");
        Employee salariedEmployee = new SalariedEmployee("Mike", "Jones", 2000.0);
        Employee commissionedEmployee= new CommissionedEmployee("Mike", "Jones",2500.0,100.0);
        Employee basePlusEmployee= new BasePlusEmployee("Mike", "Jones", 1000.0, 40.0, 50000.0);

String[] emp= {salariedEmployee.paycheck(), commissionedEmployee.paycheck(), basePlusEmployee.paycheck()};
listEmployees(emp);
        System.out.println(bonusAlert(salariedEmployee, 2000.0));

       printEmployeeFullName(salariedEmployee);
    }

    public static void listEmployees(String[] array){
        for(int x=0; x < array.length; x++);
        System.out.println(Arrays.toString(array));
    }
    public static String  bonusAlert(Employee employee,double salary){
      return employee + " Has earned a bonus of " + salary + 50.0;
    }

    public static void printEmployeeFullName(Employee employee){
        System.out.println(employee.getFirstName() + " " + employee.getLastName());
    }
}