import java.util.Scanner;


//終極密碼，1~100的數字
public class GuessNumber {
    public static void main(String[] args) {

        int num = LotteryGenerator.getNum2(100);
        int max=100;
        int min=0;

        Scanner keyboard = new Scanner(System.in);

        while (true){ //建置一無限迴圈
            System.out.print("請猜一個值介於"+min+"到"+max+"之間:");
            int guseeNum=keyboard.nextInt();

            if(guseeNum==num) {
                System.out.println("恭喜答對!!");
                break;
            }
                else if(guseeNum>num){
                    max=guseeNum;
                }
                else {
                    min=guseeNum;
                }
            }
            System.out.println("密碼是:"+num);
        }
    }

