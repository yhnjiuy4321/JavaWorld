import java.util.Date;

public class IcCard {

    private long id;
    private int money;
    static int counter;//static共享，一個系統只會有一個counter
/*
    static {
        counter = 100;
    }
    代表counter = 100被共享，只會被執行一次
*/

    private final static double bonus = 1.2;
    //private 是指只有IcCard可以使用
    //static 是指共享，只會有一個bonus
    //final設定後 不能再被定義

    private static int num=1;

    static int getNum(){
        return IcCard.num;
    }



    IcCard(){
        id=new Date().getTime();
        money=0;
        IcCard.counter++;//每多一張IcCard就會讓counter+1
    }

    public long getId() {
        return id;
    }

    public int getMoney(){
    return money;
    }

    //加錢後的紅利計算
    public void addMoney(int money) {
        if (money > 0 && money <= 10000) {
            if(money>1000) {
                this.money += money * IcCard.bonus;
            }
            else{
                this.money = money;
            }
        }
        else {
            System.out.println("FAIL");
        }
    }

    void show(){
        System.out.println(id+","+money);
    }


    //toString()是一個方法，用來回傳物件的字串表示，所以可以直接用System.out
    @Override
    public String toString() {
        return "IcCard{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }



    //比大小，取最大值
    static int getMax(int num1,int num2){
        int max = num1;
        if(num2>max){
            max = num2;
        }
        return max;
    }
}

//成員變數預設值(除非用final定義)


