//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       student aaa=new student();

       aaa.showInfo();
       //出現null，則為不存在的值(如無設定電腦預設)
       //tom.student(1112, 18,"ccc"); ---> 這樣寫是錯誤的，因為student()不是一個方法

       student bbb=new student(1111);
       bbb.showInfo();

       student ccc=new student(1112, 18,"ccc");
       ccc.showInfo();

        }
    }
