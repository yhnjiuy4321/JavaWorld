import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        //輸入一個長度大於等於6的英文字串
        //取得一字串，e開頭f結尾，並印出
        //若無則印出字串不存在

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入長度大於等於6的字串: ");
        String word = sc.next();

        //設定word字串中，從前面數來第一個e與F
        int begin =word.indexOf("e");
        int end = word.indexOf("F");

        if(word.length()>=6){//字串長度若大於等於6
            if((begin>=0)&&(end>0)&&(end>begin)) {//end要比begin還要後面
                String sub = word.substring(begin, end+1);
                //the range of substring:
                //beginIndex---the beginning index,inclusive.
                //endIndex---the ending index, exclusive.(the reason about why end+1)

                System.out.println(sub);
            }
            else {
                System.out.println("無此字串");
            }

        }
    }
}



