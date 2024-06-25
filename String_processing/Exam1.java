import java.util.Scanner;


public class Exam1 {
    public static void main(String[] args) {
        //輸入一個長度為8的英文字串
        //規則:a|A=4,s|S=5,t|T=7,o|O=0
        //EX:School=5ch00l

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入長度大於等於6的字串: ");
        String word = sc.next();

        if(word.length()>=6) {

            word = word.replace("a", "4");
            word = word.replace("A", "4");
            word = word.replace("s", "5");
            word = word.replace("S", "5");
            word = word.replace("t", "7");
            word = word.replace("T", "7");
            word = word.replace("o", "0");
            word = word.replace("O", "0");

            System.out.print("Answer: " + word);

        }
        else {
            System.out.print("長度至少要為6!!");
        }
    }
}
