public class HourlyEmployee extends Employee {


    private double hourlyWage;

    private int hoursWorked;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name, String id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name, String id) {
        super(name, id);
    }




    @Override
    public double calculateSalary() {

        double monthSalary;
        double days=30;
        double hours=8;

        monthSalary=hourlyWage*days*hours;

        return  monthSalary;
    }

    @Override
    public void show() {
        System.out.println("Name: "+getName()+"\nID: "+getId()+"\nHourly Wage: "+hourlyWage+"\nMonthly Salary: "+calculateSalary());

    }


}
