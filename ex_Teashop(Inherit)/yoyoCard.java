public class yoyoCard extends CreditCard{

    public void pay(int money){
        amount=amount-money;
        System.out.println("yoyo card 付錢: "+money+" 剩餘: "+amount);
    }

    @Override
    public void charge(int money) {
        amount=amount+money;
        System.out.println("yoyo card 加值: "+money+" 餘額: "+amount);
    }

    @Override
    public void showAmount() {
        System.out.println("yoyo card 目前額度: "+amount);
    }
    /*
    如果該方法在中間的父類中被重寫，最終的子類將使用「中間父類」的重寫版本，而不是原始父類的方法。
    這是因為子類的繼承鏈遵循從最近的父類開始查找方法的規則。

    故:yoyoCard使用CreditCard的方法，而非Machine的方法，因為子類會繼承最接近的父類。
    */

    @Override
    public String toString() {
        return "yoyoCard{" +
                "amount=" + amount +
                '}';
    }
}
