import java.util.*;

public class Xmas_tree {
    public static void main(String args[]) {

        int n, i, j;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in the tree: ");
        n = sc.nextInt();


        if (n > 3) {
            for (i = 1; i <= (n * 2) - 1; i += 2) {
                for (j = (n * 2) - 1; j > i; j -= 2) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j += 1) {
                    System.out.print("*");
                }

                System.out.println();
            }
            for (i = 1; i <= 3; i++) {
                for (j = 1; j <=( n - 2); j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 3; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}

