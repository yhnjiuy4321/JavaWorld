public class Main {
  public static void main(String[] args) {
    Employee emp1 = new SalariedEmployee("Tom", "123", 240000);
    Employee emp2 = new HourlyEmployee("Mary", "456", 200, 160);
    Employee emp3 = new SalariedEmployee("Sandy", "333", 240000);
    System.out.println(emp1);
    System.out.println(emp2);
    System.out.println(emp1.equalsSalary(emp2));
    System.out.println(emp1.equalsSalary(emp3));

  }
}