public class Test {

    //call by value(只會引用值，不會引用變數)
    void addOne(int num){
        System.out.println("C:"+num);
        num++;
        System.out.println("D:"+num);

    }
    //call by reference(引用變數)
    //void用來執行操作而不返回任何數值，卻可簡化代碼與調用方法
    void addAge(aStudent name){  //aStudent為類別，name為變數
        System.out.println("c:"+ name.age);
        name.age++;
        System.out.println("d:"+ name.age);

    }//void不能再寫return!!!!
}
