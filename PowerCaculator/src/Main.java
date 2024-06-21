public class Main {

    // 计算 b 的 e 次方
    public static int power(int b, int e) {
        // 基底情况：任何数的 0 次方都是 1
        if (e == 0) {
            return 1;
        }
        // 递归步骤：b 的 e 次方是 b 乘以 b 的 e-1 次方
        else {
            return b * power(b, e - 1);
        }
    }

    public static void main(String[] args) {
        int base = 4;
        int exponent = 2;
        int result = power(base, exponent);
        System.out.println(base + " 的 " + exponent + " 次方是 " + result);
    }
}


