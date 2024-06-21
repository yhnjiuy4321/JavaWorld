import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {

        System.out.print("Please enter a four-digit password: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // 將輸入四位數，每一位數加7後除以10取餘數
        int firstDigit = (num / 1000 + 7) % 10;
        int secondDigit = ((num / 100) % 10 + 7) % 10;
        int thirdDigit = ((num / 10) % 10 + 7) % 10;
        int fourthDigit = (num % 10 + 7) % 10;

        // 第一與第三位數對調，再將第二與第四位數對調，接著組合新數字
        int newNum = thirdDigit * 1000 + fourthDigit * 100 + firstDigit * 10 + secondDigit;

        System.out.printf("After encryption:"+"%04d", newNum);
    }
}
