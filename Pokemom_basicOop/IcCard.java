public class IcCard {
  long id;
  int money;

  void showInfo() {
    System.out.println("卡號: " + id);
    System.out.println("餘額: " + money);
  }

  int addMoney(int newMoney) {
    int sum =  money + newMoney;
    return sum;
  }

}
