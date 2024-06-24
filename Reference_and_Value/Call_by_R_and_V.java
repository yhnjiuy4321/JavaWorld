public class Call_by_R_and_V {
    public static void main(String[] args) {

        //EX:call by value(只會引用值，不會引用變數)
        int num=10;
        System.out.println("A:"+num);
        Test test1=new Test();
        test1.addOne(num);
        System.out.println("B:"+num);
        //addOne方法中對num進行了修改，但是這個修改只是在方法內部，不會影響到方法外部的num
        //所以無論如何，num的值都不會改變


        System.out.println("=====================================");



        //EX:call by reference(引用變數)
        aStudent tom=new aStudent();
        tom.age=18;
        System.out.println("a:"+tom.age);
        Test test=new Test();
        test.addAge(tom);//addAge方法中要去調用aStudent類別的age屬性，而tom是aStudent裡的一個實例，故可以使用
        System.out.println("b:"+tom.age);//addAge方法中對tom的age屬性進行了修改，所以這裡輸出的是19
    }

}


