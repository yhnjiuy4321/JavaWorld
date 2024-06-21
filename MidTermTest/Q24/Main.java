//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1=new Student1("Ken",18,180,80);
        Student student2=new Student2("Amy",25);
        Student student3=new Student3("John",32);

        Student.CalBMI(student1);
        Student.CalBMI(student2);
        Student.CalBMI(student3);
    }
}


//Student.BMI(student1);
