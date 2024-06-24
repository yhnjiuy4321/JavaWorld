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

    System.out.println("卡片張數為:"+IcCard.counter);

    System.out.println("================");

    System.out.println(IcCard.getNum());//getNum()為IcCard的方法
    System.out.println(IcCard.getMax(12,14));//getMax()是IcCard的方法


    }
}
