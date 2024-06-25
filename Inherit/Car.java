public class Car extends Vehicle {

    private  String color;

    // 子類的構造器
    public Car(String brand, int doors,String color ,int x) {
        super(brand,doors);// 調用父類的構造器，傳遞品牌與門數
        this.color=color;
        age=x;//age是父類的，因為設定protect，所以子類可以拿來用，而子容器則要記得建置對應的變數(比如x)
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}

/*
super()用來呼叫父類變數使用
父的容器中有幾個變數，子容器就一定至少要有那幾個(只能多不能少)

以下舉例:
public 父類(String aaa ,int bbb) {
     this.aaa = aaa;
     this.bbb = bbb;
}
private final String color;
public 子類(String aaa, int bbb,double ccc) {
    super(aaa,bbb);// 呼叫父類的構造器(父類有aaa,bbb，所以子類一定要有aaa,bbb)
    this.ccc=ccc;(子類自己的，所以才會有「private final String color;」)
}

如果set/get(或其他方法)，「aaa,bbb」要在父類裡建置，「ccc」則在子類自己裡面建置

protect建置於父類，只有子類或同一套件可以取而用之
(記:爸爸保護家產，所以只有後代可以用爸爸的東西，其他人不行)
 */