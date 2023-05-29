package _abstract.exer;

public class SalariedEmployee extends Employee{
    private double monthlySalary;//月工资

    public SalariedEmployee() {
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

//   public double getMonthlySalary() {
//       return monthlySalary;
//  }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" + super.toString()+"]";
    }
}
