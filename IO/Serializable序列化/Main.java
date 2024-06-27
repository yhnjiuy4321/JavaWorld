import java.io.*;

/*
ObjectOutputStream與ObjectInputStream是用來讀取或寫入物件的類別(class)，ObjectInputStream可以讀取物件，ObjectOutputStream可以寫入物件
*/

public class Main {
    public static void main(String[] args) {

        String filename = "";//先宣告filename，並初始化為空值
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入要建立的檔名:");
            filename = br.readLine();
            System.out.println("檔名為:" + filename);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        if (!filename.isEmpty()) { //若檔名不為空值，則執行以下程式碼(確保已建檔名)
            Student Tom = new Student("Tom", "001", "IECS", 18);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));{
                    oos.writeObject(Tom);
                    oos.flush();

                //讀出檔案
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
                System.out.println(Tom.getName() +","+Tom.getId()+ "," + Tom.getDepartment() + "," + Tom.getAge());
                ois.close();
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

