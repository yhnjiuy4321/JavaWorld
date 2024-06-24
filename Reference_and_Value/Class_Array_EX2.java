public class Class_Array_EX2 {
    public static void main(String[] args) {

        IcCard[] cards=new IcCard[5];

        /*IcCard(屬性)、cards(陣列名稱)、card(陣列的各車廂)，無此迴圈無法讀取出來(但基本型態無定義亦可取出來)*/
        //cards如同列車名稱如自強號，card則是車廂編號
        for (int i=0;i<cards.length;i++){
            IcCard card =new IcCard();
            card.id=i+1;
            card.money=card.id*10;

            card.add(50);
            //card.showInfo();此行效果形同下面for-each迴圈的輸出

            cards[i]= card;//有此行才能print出下面「System.out.println(cards[0].add(100))」
        }

        cards[0].add(100);//指定第1節車廂加值

        for(IcCard Tcard:cards){
            System.out.println(Tcard.id+","+ Tcard.money);
        }

        /*加總*/
        int amount=0;
        for(IcCard card:cards){
            amount+=card.money;
        }
        System.out.println("總額:"+amount);
    }
}
