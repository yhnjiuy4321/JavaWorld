public class Lottery {
    public static void main(String[] args) {
//從1~50中選出隨機6的號碼不重複
    int[] nums= LotteryGenerator.getNum(6,49);
    //當LotteryGenerator.getNum()完成後，會回傳一個陣列，此陣列的值會被放入nums

        //利用for-each把nums印出來
        for(int num:nums){
        System.out.println(num);
        }
    }
}