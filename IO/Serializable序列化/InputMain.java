import java.io.*;

public class InputMain {
    public static void main(String[] args) {

        String filename = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入儲存檔名:");

            filename = br.readLine();
            System.out.println("檔名為:" + filename);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        if (!filename.isEmpty()) {

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