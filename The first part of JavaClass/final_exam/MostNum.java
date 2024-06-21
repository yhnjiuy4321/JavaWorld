import java.util.*;

public class MostNum {
    public static void main(String[] args) {
        int[] counts = new int[10];


        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ten numbers:");

        // 讓使用者輸入十個數字
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            if (input < 0 || input > 10) {
                System.out.println("Out of range");
                return;
            }
            counts[input]++;//input是數值，++是該數出現次數的累加
        }
        // 找出出現次數最多的數字
        int maxtime = 0;
        int muchNum = 0;
        for (int j = 0; j < 10; j++) {//j的範圍為0~9，故i<10
            if (counts[j] > maxtime) {//ex:count[6]=2，i=6
                maxtime = counts[j];
                muchNum = j;
            }
        }
        System.out.println("The most number:"+maxtime);
        System.out.println("Time:"+muchNum);
    }
}
