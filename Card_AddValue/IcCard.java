public class IcCard {
    int id;

    int money;

    void showInfo() {
        System.out.println(id + "," + money);
    }

    void add(int money) {
        this.money += money;
        System.out.println(id+" add money:" + money + "，amount:" + this.money);
    }
}