public class yoyoCard extends CreditCard{

    public void pay(int money){

        amount=amount-money;

        System.out.println("yoyo card 付錢: "+money+" 剩餘: "+amount);


    }

    @Override
    public String toString() {
        return "yoyoCard{" +
                "amount=" + amount +
                '}';
    }
}
