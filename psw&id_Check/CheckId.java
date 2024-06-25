import java.util.Scanner;

public class CheckId {
    public static void main(String[] args) {

        //使用者輸入學號 ex:D1234567
        //檢查學號是否有效

        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入學號: ");
        String word = sc.next();

        if(word.length()==8) { //長度為8碼
            if(word.charAt(0)=='D') { //或用startsWith
                if((word.substring(1,word.length()-1).matches("\\d{7}"))){ //後七碼必須是數字字串
                System.out.println("該學號有效");
                }
                else {
                    System.out.println("後七碼必須是數字字串");
                }
            }
            else {
                System.out.println("首位英文字有誤");
            }
        }
        else {
            System.out.println("請輸入八碼");
        }
    }
}

//""是物件
//''是字元
//第三步確認數字字串，也可以用迴圈+布林

/*
boolean isDigit=true;
for(int i =1;i<word.length();i++){
    char ch = word.charAt(i);
    if(ch<'0'||ch>'9'){
    isDigit=false;
    break;
    }
}
*/

/*

if(word.matches("D[0-9]{7}")) 直接一行表示

//?:0或一次
//^=not
//{x}出現x次
//$:字串結尾
//[0-9]=\\d(數字)
//[0-9a-zA-Z]=\\w(任意英文與數字)
}

*/