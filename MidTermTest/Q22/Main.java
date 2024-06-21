import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please input your last name and first name: ");
        String last = sc1.next();
        String first = sc1.next();

        while(last.equals(first)) {
            System.out.print("Incorrect!please input your name again: ");
            Scanner sc2 = new Scanner(System.in);
            last = sc2.next();
            first = sc2.next();
        }

        System.out.println("Hello "+last.toUpperCase()+","+first.toUpperCase()+"!");

    }
}
