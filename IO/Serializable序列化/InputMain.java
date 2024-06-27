import java.io.*;

public class InputMain {
    public static void main(String[] args) {

        String filename = "";//宣告filename，並初始化為空值
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入已儲存的檔名:");

            filename = br.readLine();
            System.out.println("檔名為:" + filename);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        if (!filename.isEmpty()) {//若檔名不為空值，則執行以下程式碼(確保已建檔名)

            try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename));) {
                Student Tom = (Student)oos.readObject();
                System.out.println(Tom.getName() +","+Tom.getId()+ "," + Tom.getDepartment() + "," + Tom.getAge());
            }
            catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}