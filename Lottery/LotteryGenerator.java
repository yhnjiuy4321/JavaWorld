public class LotteryGenerator {

    static int[] getNum(int length,int endNum) {

        int[] numbers = new int[length];//初設陣列

        int index = 0;

        while (index < length) { //把index當作索引碼，當index未超過length，就執行下面程式碼

            int num = getNum2(endNum);//設num，使用亂數產生方法

            //從0開始生亂數，產生完後，索引碼+1，進行下一碼的亂數產生
            //這裡只會進來一次
            if (index == 0) {
                numbers[index] = num; //此時會變成 numbers[0] = num;
                index++;
                continue;  //返回while重新做
            }

            //檢查有無重覆
            boolean isExist = false;
            for (int i = 0; i < index; i++) {
                if (numbers[i] == num) {  //第一次進來時:numbers[0]已經有值，右邊的num是新的值，遂新舊值比較
                    isExist = true;       //若相等，isExist為true，然後跳出迴圈
                    break;                //若不相等，則for迴圈結束，往下走if
                }
            }

            if (!isExist) {             //當產生出相等的數值則無法進入此if敘述中
                numbers[index] = num;   //若不相等，!isExist=true，numbers[(index=)1]即為亂數產生之數值
                index++;                //index+1(索引馬+1)，繼續下一次while，值到超過length
            }
        }
            return numbers;
    }


    //亂數產生方法
    static int getNum2(int endNum) {
    double random = Math.random(); //0.0~0.99
    random=random *  endNum;
    int result=(int) random+1;//讓數值變成整數0~100
    return result;

    }
}



