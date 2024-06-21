import java.util.*;

public class MAX_min_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;

        System.out.print("Enter the ten number : ");
        for (int i = 0; i < 10; i++) {
            float number = sc.nextFloat();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.printf("max: %.2f\n" , max);
        System.out.printf("min: %.2f\n" , min);
    }
}

/*
第二種:
        import java.util.*;
public class Main {

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int a=10 ;
        float[] temp = new  float[a];

        for (int i = 0; i < a; i++) {
            temp[i] = sc.nextFloat();
        }
        float min = temp[0];
        float max = temp[0];

        for(float i : temp) {
            if(i < min){
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        System.out.printf("max: %.2f\n" , max);
        System.out.printf("min: %.2f\n" , min);
    }
}
*/