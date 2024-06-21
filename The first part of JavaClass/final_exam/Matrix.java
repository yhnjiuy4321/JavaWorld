import java.util.*;

public class Matrix {

    public static void main(String args[]) {
        int a,b;

        System.out.print("Input weight of the sequence matrix:");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();

        System.out.print("Input height of the sequence matrix:");
        b = sc1.nextInt();


        for (int x=0; x<=b; x++) {
            for (int y=0; y<=a; y++) {
                if(x+y>a+b)
                    continue;
                System.out.printf("%5d",x+y);
            }
            System.out.println();

        }
    }
}