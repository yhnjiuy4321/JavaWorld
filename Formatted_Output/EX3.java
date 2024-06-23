/*

此範例是展示運用格式化讓輸出的結果更美觀

 */
public class EX3 {
    public static void main(String[] args) {

        String name1 = "餅乾";
        int price1 = 30;
        int num1 = 3;

        String name2 = "麵包";
        int price2 = 50;
        int num2 = 5;

        int sum1 = price1 * num1;
        int sum2 = price2 * num2;

        System.out.printf("品名\t數量\t單價\t小計\n");

        System.out.printf("=============================\n");

        System.out.printf("%s\t%d\t%d\t%d\n", name1, price1, num1, sum1);

        System.out.printf("%s\t%d\t%d\t%d\n", name2, price2, num2, sum2);

        System.out.printf("=============================\n");

        System.out.printf("總計 = %d\n", sum1+sum2);



    }
}
