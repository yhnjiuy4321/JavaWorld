public class BmiUtil {

    public double getBmi(String strweight,String strheight) throws InvalidBmiNumException{

        double weight = 0;
        double height = 0;


        try { //嘗試執行這段程式碼，如果有錯誤，就執行catch裡面的程式碼
            weight = Double.parseDouble(strweight);
            height = Double.parseDouble(strheight);

            if(height<=0 || height>=300){
                throw new InvalidBmiNumException("Error:Height value is invalid");
                //throw new 意思是拋出一個新的例外，這個例外是自訂的，所以要new一個新的例外

                //throw與throws的差別在於throw是用來拋出例外，throws是用來宣告例外
                //如果不throws，就要用try/catch來處理例外
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());//e.getMessage()是取得例外的訊息
            return 0;

            //括號裡面可以放多個例外(但多個例外只能夠用同一個statement)，也可以用多個catch來區分不同的例外

        } finally {
            System.out.println("Always execute.....");
        }

        /*
        double weight = Double.parseDouble(strweight);
        double height = Double.parseDouble(strheight);
        */

        //如果有例外，就不會執行到這行，因為會直接跳到catch，之後再跳到finally，之後再跳到main
        height = height / 100;
        return weight / (height * height);//return也可以放進try裡面

   }
}
/*
try 和 catch:
在Java中通常是一起使用的，
這是因為try區塊用於包含可能會產生異常的程式碼，
而catch區塊則用於處理這些異常。

finally:
區塊包含的程式碼會在 try 和 catch 區塊之後無論是否有異常產生都會被執行，所以可有可無。
這對於資源清理，如關閉檔案或網路連接等，非常有用。

------- 例外處理 -------

catch (Exception e) { Exception是所有例外的父類別，所以可以捕捉所有例外，但不易區別
    System.out.println(e.getMessage());
    return 0;
}

常見例外:
NumberFormatException:當字串轉換為數字時，如果字串不是數字，就會拋出這個例外
ArithmeticException:當除數為0時，就會拋出這個例外
ArrayIndexOutOfBoundsException:當陣列的索引超出範圍時，就會拋出這個例外
NullPointerException:當物件是null時，就會拋出這個例外
FileNotFoundException:當檔案不存在時，就會拋出這個例外
IOException:當輸入或輸出發生錯誤時，就會拋出這個例外
ClassNotFoundException:當找不到類別時，就會拋出這個例外
SQLException:當資料庫操作發生錯誤時，就會拋出這個例外
RuntimeException:當程式執行時發生錯誤時，就會拋出這個例外

***也可以自訂例外，只要繼承Exception就可以了

*/