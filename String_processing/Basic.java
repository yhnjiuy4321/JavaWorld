
public class Basic {
    public static void main(String[] args) {
        String greeting1="hello";
        String greeting2="hello";
        String greeting3=new String("hello");

        //是否指到相同物件(reference)
        System.out.println("compare by reference:");
        System.out.println(greeting1 == greeting2);
        System.out.println(greeting1 == greeting3);

        System.out.println();

        //是否指到相同內容(content)
        System.out.println("compare by content:");
        System.out.println(greeting1.equals(greeting2));
        System.out.println(greeting1.equals(greeting3));


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");


        String greeting="hello";
        greeting=greeting+"1";
        System.out.println(greeting);

        System.out.println(greeting.replace("e","E"));
        //當你調用replace方法時，它實際上會創建一個新的String對象來存儲修改後的值，而原始的String對象不會被改變。

        System.out.println(greeting);//原本的greeting不會改變(可比較stringbuffer)
        //若用greeting = greeting.replace("e","E");則會改變 --->方法一

        String newGreeting=greeting.replace("h","H");
        //透過建置新物件來建立修改的樣子 --->方法二
        System.out.println(newGreeting);


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        //汽車類別
        Car car=new Car("black",10);
        System.out.println("Original:"+car);
        car.setColor("white");
        car.setId(20);
        System.out.println(car.getColor());
        System.out.println(car.getId());
        System.out.println("After:"+car);

        }
    }
