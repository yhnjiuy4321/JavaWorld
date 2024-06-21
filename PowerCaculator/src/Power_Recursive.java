class Recursive {
    int power(int b, int e) {  //b的e次方(b,e)
        // 基底情况：任何数的 0 次方都是 1
        if (e == 0) {
            return 1;
        }
        // 递归步骤：b 的 e 次方是 b 乘以 b 的 e-1 次方
        else {
            return b * power(b, e - 1);
        }
    }
}


class Power_Recursive {
    public static void main(String[] args) {
        Recursive r = new Recursive();
        int x=4,y=2;

        r.power(x,y);

        System.out.println(x+"的"+y+"次方:"+r.power(x,y));

    }
}
