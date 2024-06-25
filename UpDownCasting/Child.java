public class Child extends Parent {


    public void sayhi() {
        System.out.println("bye");
        //override覆寫:上轉之後，子可以用父之方法且改變使用內容
    }

    public void study(){
        System.out.println("studying");
    }
}
