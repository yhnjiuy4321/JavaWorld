import java.io.*;

public class Main {
    public static void main(String[] args) {

        String filename = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入檔名:");
            filename = br.readLine();
            System.out.println("檔名為:" + filename);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        if (!filename.isEmpty()) {
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