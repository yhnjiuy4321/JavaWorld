import java.util.*;

public class EX1 {
    public static void main(String[] args) {


        System.out.println(Integer.toString(100, 2));
        //Integer.toString()函數，可以將整數轉換為指定進制的字符串:第一個參數是要轉換的整數，第二個參數是進制(比如2為二進制)


        for(;;){//無限循環，也可以用while(true)

            Scanner keyin = new Scanner(System.in);

            int value;

            System.out.printf("請輸入一個整數 =>");

            value = keyin.nextInt();

            System.out.printf("\t 10 進位表示 = %d\n", value);
            //%d表示整數，所以可以用來表示十進位數字，value是要格式化的參數，後面的value會替換%d，用,隔開(以下同理)


            System.out.printf("\t 16 進位表示 = %x\n", value);
            //%x表示十六進位，所以可以用來表示十六進位數字

            System.out.printf("\t 8 進位表示 = %o\n", value);
            //%o表示八進位，所以可以用來表示八進位數字

            System.out.printf("\t 2 進位表示 = %s\n",Integer.toBinaryString(value));
            //Integer.toBinaryString()函數，可以將整數轉換為二進位表示
            //%s表示字符串，所以可以用來表示二進位數字
            //也可以這樣表示 ---> System.out.printf("\t 2 進位表示 ="+Integer.toBinaryString(value));

            System.out.printf("\t 浮點數表示 = %.2f\n", (float)value);
            //%f表示浮點數，所以可以用來表示浮點數
            //(float)value表示將整數轉換為浮點數

            System.out.printf("\t unicode = \u0058 =%c", 0x58);
            //  \u0058表示unicode編碼
            //  %c將後面的參數解析為字符並插入到格式化字符串中
            System.out.println();

        }
    }
}