public class CreditCard extends Machine{

    public void withdraw(int money){

        amount=amount-money;

        System.out.println("提取: "+money+" 剩餘: "+amount);

    }

    public void pay(int money){

        amount=amount-money;

        System.out.println("CreditCard 付錢: "+money+" 剩餘: "+amount);

    }
}
