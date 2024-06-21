public class Student1 extends Student{

    public Student1(String name, int age, double height, double weight) {
        super(name, age, height, weight);

        double bmi = weight / Math.pow(((height)/100), 2);
        System.out.println("Student1 name:"+name);
        System.out.println("Student1 Age:"+age);
        System.out.printf("Student1 BMI: %.2f%n",bmi);
        System.out.println();


        }

    }

