public abstract class Employee {

    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void show();


    public abstract double calculateSalary();

    public boolean equalsSalary(Employee other) {
        if (this.calculateSalary() == other.calculateSalary()) {
            return true;
        } else {
            return false;
        }
    }
}
