public class main2 {
    public static void main(String[] args) {
    IcCard kkk=new IcCard();
    kkk.addMoney(200);
    kkk.show();
    System.out.println(kkk);

    IcCard yyy=new IcCard();
    yyy.addMoney(1200);
    yyy.show();
    System.out.println(yyy);

    System.out.println(IcCard.counter);
    System.out.println(IcCard.getNum());
    }
}
