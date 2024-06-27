import java.io.*;

//先用此Main創造一個檔案(Ex:aaa)，再用ReaderMain讀取檔案內容
public class Main {
    public static void main(String[] args) throws IOException { //throws IOException是拋出例外，讓呼叫者處理

        //純粹讀取標準輸入

        InputStreamReader is = new InputStreamReader(System.in);
        //System.in是標準輸入，InputStreamReader是將位元轉換成字元輸入(位元轉字元)
        BufferedReader br = new BufferedReader(is);
        //BufferedReader是將字元輸入轉換成字串輸入(字元轉字串)
        String line = br.readLine();
        //讀取一行字串，並存入line
        //順序是:標準輸入(InputStreamReader)->位元轉字元輸入(BufferedReader)->字元轉字串輸入(String)

        System.out.println(line);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in))<---(將8、10兩行合併成一行)



        //----------------------------------------------

        /*
        輸入要建立的檔名，並寫入資料(銜接上面的程式碼)
        */
        try {
            System.out.println("請輸入要建立的檔名:");
            String filename = br.readLine();
            System.out.println("檔名為:"+filename);


            //要在檔案中寫入資料，使用FileWriter
            FileWriter fw = new FileWriter(filename); //建立檔案，檔案名稱為filename
            BufferedWriter bw = new BufferedWriter(fw); //將FileWriter轉換成BufferedWriter(非必要，但效能較好)
            bw.write("Hello World\n"); //寫入Hello World
            bw.newLine();
            bw.write("i love Java\n");
            bw.newLine();
            bw.write("i hate Java\n");
            bw.newLine(); //換行
            bw.flush(); //清除緩衝區，用意是將資料寫入檔案後，不會留在緩衝區
            bw.close(); //關閉檔案，用意是釋放資源

            //可以指定檔案的位置，例如:FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\test.txt");，或在輸入時指定
            //若不指定，則會在專案的根目錄下建立檔案


        }catch (IOException e){
           System.out.println("Error reading line");
        }
    }
}

