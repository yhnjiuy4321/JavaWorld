//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     CreditCard c1 = new CreditCard();
     yoyoCard c2 = new yoyoCard();
     //Machine c3 = new Machine();
     TeaShop c4 = new TeaShop();

     c1.showAmount();
     c2.showAmount();
     System.out.println("--------------");

     c1.pay(100);
     c1.withdraw(200);
     c2.pay(100);
     //c2.withdraw(200);//yoyoCard繼承CreditCard，所以可以使用CreditCard的方法


     System.out.println("\n-----買飲料-----");

     c4.teaShop(c1);
     c4.teaShop(c2);

     System.out.println("\n-----存錢/加值-----");
     c1.charge(50);
     c2.charge(80);

     //System.out.println(c1.getAmount());
    }
}
