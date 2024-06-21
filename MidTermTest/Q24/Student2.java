import java.util.Scanner;

public class Student2 extends Student {
    public Student2(String name, int age) {
        super(name, age);

            Scanner sc = new Scanner(System.in);
            System.out.print("S2 Please input your height and weight: ");
            double height = sc.nextDouble();
            double weight = sc.nextDouble();

            double bmi = weight / Math.pow(((height) / 100), 2);
            System.out.println("Student2 name:" + name);
            System.out.println("Student2 Age:" + age);
            System.out.printf("Student2 BMI: %.2f%n", bmi);
            System.out.println();


    }
}
