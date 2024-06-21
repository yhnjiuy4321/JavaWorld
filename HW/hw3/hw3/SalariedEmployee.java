public class SalariedEmployee extends Employee{

    private double annualSalary;

    public SalariedEmployee(String name, String id) {
        super(name, id);
    }

    @Override
    public void show() {
        System.out.println("Name: "+getName()+"\nID: "+getId()+"\nMonthly Salary: "+calculateSalary());

    }

    @Override
    public double calculateSalary() {

        double monthSalary ;
        monthSalary=annualSalary/12;
        return  monthSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }



}
