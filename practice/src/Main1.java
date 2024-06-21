//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      icCard card1=new icCard();//icCard??????A???j?g??????A?]?R?W?W?h)?A?w?q???

        card1.id=100001;//id????100001
        card1.money=300;

        //System.out.println(card1.id);
        //System.out.println(card1.money);

        card1.showInfo();

        int newMoney = card1.addMoney(100);
      System.out.println(newMoney);
        icCard card2=new icCard();
        card2.id=100002;
        card2.money=100;

       //System.out.println(card2.id);
        //System.out.println(card2.money);

      card2.showInfo();



    }
}