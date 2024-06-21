public class Lottery {
    public static void main(String[] args) {
//從1~50中選出隨機6的號碼不重複
    int[] nums= LotteryGenerator.getNum(6,49);


    for(int num:nums){          //int[]nums中已有六個數字，利用for-each迴圈將置自依序丟進int num中輸出
    System.out.println(num);
        }
    }
}