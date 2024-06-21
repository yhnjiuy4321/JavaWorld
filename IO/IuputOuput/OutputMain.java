import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OutputMain {
    public static void main(String[] args) {



        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入檔名:");

            String filename = br.readLine();
            System.out.println("檔名為:" + filename);

            DataOutputStream dis = null;
            try {

                //DataOutputStream dis = new DataOutputStream(new FileOutputStream(filename));
                dis = new DataOutputStream(new FileOutputStream(filename));
                int n = 10;
                boolean isVaild = true;
                dis.writeInt(n);
                dis.writeBoolean(isVaild);
                dis.flush();


            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                if (dis != null) {
                    dis.close();
                }
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}