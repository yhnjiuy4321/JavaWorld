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

/*
若設定方法時，開頭沒有設定public或其他東西，系統會默認其為包級私有（package-private）
該方法只能在同一個package中被使用。
*/