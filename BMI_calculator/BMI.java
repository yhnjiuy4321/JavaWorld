import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        double bmi;

        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.print("input height(cm) and weight(kg):");
            double height = sc.nextInt();

            if(height>250||height<0){
                System.out.println("input error");
                break;
            }

            double weight = sc.nextInt();

            if(weight>150||weight<0){
                System.out.println("input error");
                break;
            }

            bmi=weight/(((height)/100)*((height)/100));
            System.out.printf("bmi: %.2f%n",bmi);
        }
    }
}



