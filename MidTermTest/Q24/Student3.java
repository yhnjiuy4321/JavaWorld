import java.util.Scanner;

public class Student3 extends Student {
    public Student3(String name, int age) {
        super(name, age);

        Scanner sc = new Scanner(System.in);
        System.out.print("S3 Please input your height and weight: ");
        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        double bmi = weight / Math.pow(((height)/100), 2);
        System.out.println("Student3 name:"+name);
        System.out.println("Student3 Age:"+age);
        System.out.printf("Student3 BMI: %.2f%n",bmi);





    }
}
