//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int i;//若無此宣告無法讀取出i
        for (i = 417;i%17!=0; i++) {
        //要找出大於417且能被17整除的第一個數，故條件為「i%17 !=0」(直到整除才停止迴圈)
        }
        System.out.print(i);
    }
}