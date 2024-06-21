public class SalariedEmployee extends Employee{

  private double annualSalary;

  public SalariedEmployee(String name, String id, double annualSalary) {
    super(name, id);
    this.annualSalary = annualSalary;
  }

  @Override
  public double calculateSalary() {
    return annualSalary/12;
  }

  @Override
  public String toString() {
    return "SalariedEmployee{" +
        "name=" + getName() +
        ", id=" + getId() +
        ", monthSalary=" + calculateSalary() +
        '}';
  }
}
