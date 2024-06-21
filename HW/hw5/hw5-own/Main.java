import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        StockProcess sp = new StockProcess();
        sp.process("stock.csv");

        /*
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            System.out.println("請輸入檔名:");
            String filename = br.readLine();
            System.out.println("檔名為:" + filename);

            BufferedReader br2 = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br2.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
*/


    }
}