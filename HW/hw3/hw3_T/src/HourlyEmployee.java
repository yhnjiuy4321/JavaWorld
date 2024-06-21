public class HourlyEmployee extends Employee{

  private double hourlyWage;
  private int hoursWorked;

  public HourlyEmployee(String name, String id, double hourlyWage, int hoursWorked) {
    super(name, id);
    this.hourlyWage = hourlyWage;
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double calculateSalary() {
    return hourlyWage * hoursWorked;
  }

  @Override
  public String toString() {
    return "HourlyEmployee{" +
        "name=" + getName() +
        ", id=" + getId() +
        ", monthSalary=" + calculateSalary() +
        '}';
  }
}
