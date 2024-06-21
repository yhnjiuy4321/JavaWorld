class Recursive {

    // 计算 b 的 e 次方
    int power(int b, int e) {
        //aaa(x,y)用於計算乘方，x=基數，y=指數

        if (e == 0) { // 基底情况：任何數的 0 次方都是 1
            return 1;
        }
        if(e%2==0)
            return  power(b, e/2) * power(b, e/2);
        else{
            return  b* power(b, e/2) * power(b, e/2);
        }
    }
}


    public class Main {
        public static void main(String[] args) {

            Recursive a = new Recursive();
            System.out.println("乘方計算後:"+a.power(10, 4));
/*
            int result=1 ,y=3,x=4;
            for(int i= 0; i<y; i++){
            result *= x;

        }
        System.out.println("result:"+result);
*/
        }
    }
