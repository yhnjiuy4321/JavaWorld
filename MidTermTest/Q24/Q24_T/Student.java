public class Student {

    private int age;
    private String name;
    private double height;
    private double weight;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, double height, double weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI(){
        double meterHEIGHT=this.height/100;
        return (this.weight/(meterHEIGHT*meterHEIGHT));

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
