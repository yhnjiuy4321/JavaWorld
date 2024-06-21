import java.util.Scanner;

public class SumOf_Odd_and_Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter the ten number: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("");
            numbers[i] = scanner.nextInt();
        }

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        System.out.println("evenSum:"+evenSum);
        System.out.println("oddSum:"+oddSum);
    }
}
