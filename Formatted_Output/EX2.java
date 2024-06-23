public class EX2 {
    public static void main(String[] args) {

        String car = "CRV 休旅車";

        int price = 75;

        System.out.printf("%s 定價是 %d 萬元\n", car, price);
        //%s、%d分別表示後面的參數是字符串和整數
        // \n表示換行
        //car、price是要格式化的參數，後面的car、price會替換%s、%d，用,隔開
    }
}
