import java.util.*;

/*
規則:
假設我喝完x瓶可樂，三個空瓶可以換一瓶全新的可樂，但
剩下兩個空瓶時，可以跟朋友借一瓶空的去換全新的一瓶，最後計算共喝了幾瓶
*/

public class ILoveCola {
    public static void main(String[] args) {

        System.out.print("How many bottles of Cola have you drank:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 200; i++) {

            int n = scanner.nextInt();

            if(n>=1){

                int total = n;//一開始的全部可樂
                int bottles = n;//一開始喝完後的空瓶

                while (bottles >= 3) {
                    int exchanged = bottles / 3;
                    total += exchanged; // 換來的可樂加到總數中
                    bottles = exchanged + bottles % 3; // 計算剩餘空瓶
                }
                // 如果剩下兩個空瓶，可以借一瓶，使全新的總數直接加一
                if (bottles == 2) {
                    total++;
                }
                System.out.println(total);
            }
        }
    }
}
