import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Student student1=new Student(18,"tom",180,84);
        Student student2=new Student(20,"amy");
        Student student3=new Student(25,"ken");


        Scanner sc = new Scanner(System.in);
        int height2=sc.nextInt();
        int weight2=sc.nextInt();
        int height3=sc.nextInt();
        int weight3=sc.nextInt();

        student2.setHeight(height2);
        student2.setWeight(weight2);
        student3.setHeight(height3);
        student3.setWeight(weight3);

        System.out.println("Student1 Name:"+student1.getName());
        System.out.println("Student1 age:"+student1.getAge());
        System.out.printf("Student1 BMI: %.2f%n",student1.getBMI());

        System.out.println("Student2 Name:"+student2.getName());
        System.out.println("Student2 age:"+student2.getAge());
        System.out.printf("Student2 BMI: %.2f%n",student2.getBMI());

        System.out.println("Student3 Name:"+student3.getName());
        System.out.println("Student3 age:"+student3.getAge());
        System.out.printf("Student3 BMI: %.2f%n",student3.getBMI());

        //printf方法用於格式化輸出。它允許你使用格式化字符串來指定輸出格式，但不會自動換行
    }
}