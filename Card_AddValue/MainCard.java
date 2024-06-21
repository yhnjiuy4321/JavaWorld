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



        //IcCard myCards = {card1, card2, card3};
        //建立myCards陣列，把card1~card3丟進去
        IcCard[] myCards = new IcCard[3];  // int[] bbb=new int[1];--->普通陣列
        myCards[0] = card1;
        myCards[1] = card2;
        myCards[2] = card3;



        //建立物件cardMachine，屬性CardMachine
        CardMachine cardMachine = new CardMachine();

        //用amount加總
        int amount = cardMachine.getAmount(myCards);      //使用getAmount方法，呼叫myCards
        //int amount = cardMachine.getAmount(new IcCard[] {card1,card2,card3});

        //用getAmount方法，返回值後
        System.out.println(amount);

        card2.showInfo();




    }
}
