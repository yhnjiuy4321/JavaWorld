public class CreditCard extends Machine{

    public void withdraw(int money){
        amount=amount-money;
        System.out.println("CreditCard 提取: "+money+" 剩餘: "+amount);
    }

    public void pay(int money){
        amount=amount-money;
        System.out.println("CreditCard 付錢: "+money+" 剩餘: "+amount);
    }


    @Override
    public void charge(int money) {
        amount=amount+money;
        System.out.println("CreditCard 存錢: "+money+" 餘額: "+amount);

    }

    @Override
    public void showAmount() {
        System.out.println("CreditCard 目前額度: "+amount);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "amount=" + amount +
                '}';
    }
}
