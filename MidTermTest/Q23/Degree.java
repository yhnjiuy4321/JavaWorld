import java.util.Scanner;

public class Degree {


    public int getDegree() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your grade: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double num4 = sc.nextInt();
        double num5 = sc.nextInt();

        double total = Math.round((num1+num2+num3+num4+num5)/5);

        return (int)total;
    }


}
