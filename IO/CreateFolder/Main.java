import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      File parentDir = new File("parent");//File是用來操作檔案和目錄的類別，new File("parent")是將parent轉換成File
      System.out.println(parentDir.exists());//判斷parentDir是否存在
      parentDir.mkdir();//建立parent資料夾
      System.out.println(parentDir.exists());
      System.out.println(parentDir.isDirectory());//判斷parentDir是否為目錄
      System.out.println(parentDir.isFile());//判斷parentDir是否為檔案

        File childFileA = new File(parentDir, "a.txt");//new File(parentDir, "child")是將parentDir和child轉換成File
        try {
            childFileA.createNewFile();//建立a.txt檔案
            System.out.println(childFileA.toString());//列印childFileA的路徑(相對)
            System.out.println(childFileA.getAbsoluteFile());//列印childFileA的路徑(絕對)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}