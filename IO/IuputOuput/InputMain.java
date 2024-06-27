import java.io.*;

/*
BufferedReader是用來讀取字元輸入的類別，InputStreamReader是用來讀取字節輸入的類別
DataInputStream與DataOutputStream是用來讀取或寫入二進位資料的類別，DataInputStream將檔案在程式中讀出來，DataOutputStream在程式中寫入二進位資料
objecInputStream與ObjectOutputStream是用來讀取或寫入物件的類別，ObjectInputStream可以讀取物件，ObjectOutputStream可以寫入物件
以上四個的差異是DataInputStream與DataOutputStream是用來讀取或寫入二進位資料，ObjectInputStream與ObjectOutputStream是用來讀取或寫入物件

字元串流同樣有兩個最上層的抽象類別Reader、Writer,分別對應於位元串流的InputStream、OutputStream
 */


public class InputMain {
    public static void main(String[] args) {

        //DataInputStream dis = null;//宣告DataInputStream，並初始化為null


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入儲存檔名:");

            String filename = br.readLine();
            System.out.println("檔名為:" + filename);

            try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) { //try-with-resources，自動關閉資源，不用再寫finally(直接在try()裡面寫入資源)
                //dis = new DataInputStream(new FileInputStream(filename)); ---> 讀取檔案，並存入dis，若檔案不存在，則拋出FileNotFoundException
                int n = dis.readInt(); //讀取整數，並存入n
                boolean isVaild = dis.readBoolean();//讀取布林值，並存入isVaild，若為true，則isVaild為true，若為false，則isVaild為false
                //int n2 = dis.readInt(); //讀取整數，並存入n2
                System.out.println("n = " + n + "," + isVaild);

                //dis.close();

            } catch (IOException e) {
                //System.out.println(e.getMessage());
                e.printStackTrace();//列印錯誤訊息，並追蹤錯誤發生的位置
            }
            /*

            finally {
                if (dis != null) {
                    try {
                        dis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            */
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


