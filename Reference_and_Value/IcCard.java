public class IcCard {
    int id;
    int money;

    void showInfo(){
        System.out.println(id+","+money);
    }

    /*加值(給的值，型別與數量要一致)*/
    boolean add(int value) {//int是類別，value變數(參數)
        int amount = money + value;
        if (value > 0 && amount <= 1000) {
            money = money+value; //money += value;
            return true;/*一定要回傳布林值*/
        }
        else {

            return false;/*一定要回傳布林值*/
        }
    }
    /*
    int add(int value) {//int是類別，value變數(參數)
        int amount = money + value;
        if (value > 0 && amount <= 1000) {
            money = money+value; //money += value;
        }
        return money;
*/
    }




