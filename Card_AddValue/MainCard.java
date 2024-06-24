public class MainCard {
    public static  void main (String[] args){
        //先建立card1~card3，並設定money
        IcCard card1 = new IcCard();
        card1.id=101;
        card1.money = 300;

        IcCard card2 = new IcCard();
        card2.id=102;
        card2.money = 100;
        card2.add(50);

        IcCard card3 = new IcCard();
        card3.id=103;
        card3.money =400;

        //顯示card1~card3的id與money
        card1.showInfo();
        card2.showInfo();
        card3.showInfo();


        System.out.println("========================");


        //建立IcCard類別的myCards陣列，把card1~card3丟進去
        IcCard[] myCards = new IcCard[3];  // int[] bbb=new int[1];--->普通陣列

        myCards[0] = card1;
        myCards[1] = card2;
        myCards[2] = card3;
        //亦同 ----> IcCard myCards = {card1, card2, card3};


        //建立物件cardMachine，屬性CardMachine
        CardMachine cardMachine = new CardMachine();


        int total = cardMachine.getAmount(myCards);
        //亦同 ---> int total = cardMachine.getAmount(new IcCard[] {card1,card2,card3});

        //用total當容器加總myCards的money
        //使用getAmount方法，把陣列myCards丟進去
        //並把返回值放進total

        System.out.println(total);
    }
}
