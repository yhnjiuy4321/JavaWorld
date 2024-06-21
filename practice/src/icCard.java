public class icCard {

    long id;

    int money;

    void showInfo(){
        System.out.println("•d∏π:"+id);
        System.out.println("æl√B:"+money);

    }

    int addMoney(int newMoney){

    money = newMoney+money;

    return money;

    }

}
