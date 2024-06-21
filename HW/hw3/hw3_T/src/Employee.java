public abstract class Employee {
  private String name;
  private String id;

  public Employee(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public abstract double calculateSalary();

  public boolean equalsSalary(Employee other) {
    //boolean isEqual = false;
    if (this.calculateSalary() == other.calculateSalary()) {
      return true;
    }
    return false;

    //return this.calculateSalary() == other.calculateSalary()
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }
}
