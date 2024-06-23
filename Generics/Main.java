import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Box<String, Integer> box = new Box<>("Hello", 1);
        box.print();
        System.out.println("t = "+box.getT());
        System.out.println("k = "+box.getK());

        System.out.println("-----------------");

        Box<Integer, String> box2 = new Box<>(1, "Hello");
        box2.print();
        System.out.println("t = "+box2.getT());
        System.out.println("k = "+box2.getK());

        /*

        box與box2的差別在於泛型的位置不同，box的泛型是String, Integer，而box2的泛型是Integer, String
        Box是一個泛型類別，我們可以在宣告Box的時候，自由的決定泛型的位置：<T,K>
        這樣的設計可以讓我們在使用Box的時候，可以自由的決定泛型的位置，這樣的設計可以讓我們在使用Box的時候，可以自由的決定泛型的位置

       　*/

        System.out.println("=================");

        Store<Apple> store = new Store<>(new Apple("Red", 100, 1000, "Korea"));
        store.print();
        Store<Banana> store2 = new Store<>(new Banana("Yellow", 200, 2000, "Philippines"));
        store2.print();

        //Store<String> store3 = new Store<>("Hello"); ---> 使用Store<String>會出現錯誤，因為Store的泛型是Fruit

        /*
        Store相當於上面的Box，但是Store的泛型是有限制的，Store的泛型是Fruit的子類別
        Store的泛型是Fruit，所以我們在宣告Store的時候，只能使用Fruit的子類別，例如Apple, Banana
        如果我們使用其他泛型，會出現錯誤，假設它不是Fruit的子類別
        這是一種「有限制的泛型設計」，我們可以在宣告Store的時候，限制Store的泛型是什麼

        相對來說，Box的泛型就是「無限制的泛型設計」
        */

        System.out.println("=================");

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("1234");
        print(list);
    }

    private static void print(List<?> content) {
        System.out.println(content);
    }

    /*

    List<?>的?是一個萬用字元，代表任何型態，所以main中的List<xxx> list ---> xxx可以是任何型態


    A.上界通配符定義(Upper Bounded Wildcards)：
    若為List<? extends Fruit> list，則xxx必須是Fruit的子類別，例如Apple, Banana
    (記:最高只到Fruit，包含Fruit)

    以下舉例說明：
     List<Apple> list = new ArrayList<>();
     list.add(new Apple("Red", 100, 1000, "Korea"));
     print(list);

     private static void print(List<? extends Fruit> content) {
        for(Fruit fruit : content) {
            System.out.println(fruit.getColor()+","+fruit.getWeight()+","+fruit.getPrice()+","+fruit.getOrigin());
        }
    }


    B.下界通配符定義(Lower Bounded Wildcards)：
    若為List<? super Apple> list，則xxx必須是Apple的父類別或是Apple本身，其父類例如Fruit
    (記:最低只到Apple，包含Apple)

    以下舉例說明：
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("Red", 100, 1000, "Korea"));
        print(list);
        }

        private static void print(List<? super Apple>  content) {
            for(Object obj : content) {

            (方法內部無法直接將列表元素視為具體的 Fruit 或 Apple 類型，
            因此，你需要將元素視為通配符「?」類型的引用或 Object 類型的引用。)

            Fruit fruit = (Fruit) obj;//將Object轉型為Fruit
                System.out.println(fruit.getColor()+","+fruit.getWeight()+","+fruit.getPrice()+","+fruit.getOrigin());
            }
        }

     */
}