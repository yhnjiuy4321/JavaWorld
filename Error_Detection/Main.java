import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {

        test_add();//測試add函數是否正確

        int z = add(8765, 1234);
        System.out.println("number is "+z);


    }

    //加法函數
    public static int add(int x, int y) {
        return x + y;
    }

    public static void test_add() {
        if (add(3, 4) != 7) System.out.println("error1");//if不需要大括號，但這僅限於當 if 語句後面只有一個語句時
        if (add(9, 9) != 18) System.out.println("error2");
        if (add(99, 99) != 198) System.out.println("error3");
        if (add(999, 0) != 999) System.out.println("error4");
        if (add(0, 0) != 0) System.out.println("error5");
        if (add(-9, 9) != 0) System.out.println("error6");
        if (add(-9, -9) != -18) System.out.println("error7");
        if (add(-9, 0) != -9) System.out.println("error8");
        /*
        透過test_add()函數，輸入不同的數值，並比對add()函數的回傳值是否正確
        輸入測試數據時，可以用較為極端的數值，例如0、負數等，來提高程式的韌性

         */
    }

    //測試函數，用於測試add()函數是否正確
    @Test//測試函數的標記
    public void testAddition() {
        assertEquals(5, add(2, 3));
        assertEquals(0, add(0, 0));
        assertEquals(0, add(-1, 1));
        /*
        透過assertEquals()函數，比對add()函數的回傳值是否正確
        這樣的寫法，可以讓測試更加直觀，並且當測試失敗時，可以直接看到失敗的測試數據
        當失敗時，會拋出AssertionError異常，並且顯示失敗的測試數據

        等於是分開了Main()函數中的test_add()函數，並且將測試數據和比對結果分開
         */

    }
}