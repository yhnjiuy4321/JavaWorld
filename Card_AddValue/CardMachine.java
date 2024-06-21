public class CardMachine {

    int getAmount(IcCard[] cards){     // cards = myCards;  // IcCard{card1,card2,card3}
    //在getAmount方法裡放入陣列，陣列中的每個索引數都是「cards」

        //建立容器
        int amount = 0;


        //建立for-each迴圈，把cards放入acard中，並加進容器(amount)中
        for (IcCard acard:cards) {
            amount = amount+acard.money;
        }
        return amount; //將值返回
        }
}
