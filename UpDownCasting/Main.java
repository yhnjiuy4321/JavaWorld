public class Main {
    public static void main(String[] args) {

        //正常用法
        Parent parent = new Parent();
        parent.sayhi(); //父類用父類方法

        System.out.println("=========================");

        /*向上轉型(子轉父)*/
        //Parent XXX = new Child(); ---> 原本是子類的child，晉升為父類(倒回去看)
        Parent parent2 = new Child();
        //也等於Parent parent2 = child1(前提要有「Child child1 = new Child()」)

        parent2.sayhi();
        //override覆寫:上轉之後，子可以用父之方法且改變使用內容
        //parent2.study(); 向上轉型後，則無法再使用原類別(子)的方法
        /*
        記:
        小孩子過年時可以收到紅包，長大之後(向上轉型)就不能再收到紅包了，
        只能變成大人發紅包，但可以改變方式，比如帶家人出國，不一定要發紅包
        */

        System.out.println("=========================");

        /*向下轉型(父轉子)*/
        //!!!!!如要使用向下轉型前，需先向上轉型後，才能再向下轉型!!!!!
        //向下轉型語法格式中一定要加上「(類型名)」<如：(Child)>，且其稱之為「強制的類型轉換」
        Child child = (Child) parent2;
        child.sayhi();
        child.study();
        child.play();

        System.out.println("------");

        //多一道檢查，避免轉型失敗
        if (parent2 instanceof Child){ //檢查變數類型是否正確(確保parent2是Child型我才能轉)
        Child child2 = (Child) parent2;
        child2.sayhi();
        child2.play();
        child2.study();
        }
    }
}
