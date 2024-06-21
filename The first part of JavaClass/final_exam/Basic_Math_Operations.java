import java.util.*;
public class Basic_Math_Operations {
    public static void main(String args[]) {
        int a, b;

        System.out.print("Enter two number(integer): ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        System.out.print("");
        b = sc1.nextInt();

        if (a <= 1000 && b <= 1000) {

            System.out.println(a+"+"+b+"="+(a+b));
            System.out.println(a+"*"+b+"="+(a*b));
            System.out.println(a+"-"+b+"="+(a-b));
            System.out.println(a+"/"+b+"="+(a/b)+"..."+(a%b));

        }
    }
}

