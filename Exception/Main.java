import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        BmiUtil AAA = new BmiUtil();

        while (true) {
            System.out.print("Input Year height:");
            String height = sc.next();
            System.out.print("Input Year weight:");
            String weight = sc.next();

            double bmi;
            try {
                bmi = AAA.getBmi(weight, height);
                System.out.println("your bmi is:" + bmi);
                break;
            } catch (InvalidBmiNumException e) {//要有BmiUtil中的例外才能catch，也就是要有throw new InvalidBmiNumException("Error:Height value is invalid");
                System.out.println(e.getMessage());
                //這裡的e.getMessage()是取得例外的訊息，會輸出"Error:Height value is invalid"，因為在InvalidBmiNumException裡面有寫
                System.out.println("Please input again");
            }
            //也可以直接在main裡面寫try/catch
        }
    }
}