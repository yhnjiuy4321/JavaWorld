import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderMain {
    public static void main(String[] args) {

        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入檔名:");
        String filename = br.readLine();//讀取一行字串，並存入filename
        System.out.println("檔名為:"+filename);


        BufferedReader fbr = new BufferedReader(new FileReader(filename));
        //讀取檔案，並存入fbr(FileReader是讀取檔案，BufferedReader是將字元輸入轉換成字串輸入)

        String line=null;//宣告line，並初始化為null(設定為空值)
        while ((line = fbr.readLine()) != null){ //當line不為空值時，執行迴圈
        System.out.println(line);
        }

        }catch (IOException e){
        System.out.println(e.getMessage());
        }
    }
}