public class icCard {

    long id;

    int money;

    void showInfo(){
        System.out.println("�d��:"+id);
        System.out.println("�l�B:"+money);

    }

    int addMoney(int newMoney){

    money = newMoney+money;

    return money;

    }

}
