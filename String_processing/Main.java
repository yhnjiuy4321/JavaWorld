



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        //String greeting=new String("hello");
        /*
        String greeting1="hello";
        String greeting2="hello";
        String greeting3=new String("hello");

        //是否指到相同物件(reference)
        System.out.println(greeting1 == greeting2);
        System.out.println(greeting1 == greeting3);

        //是否指到相同內容(content)
        System.out.println(greeting1.equals(greeting2));
        System.out.println(greeting1.equals(greeting3));
*/

        String greeting="hello";
        greeting=greeting+"1";
        System.out.println(greeting);

        System.out.println(greeting.replace("e","E"));
        System.out.println(greeting);//未改變

        String newGreeting=greeting.replace("h","H");
        //透過建置新物件來建立修改的樣子
        System.out.println(newGreeting);


        Car car=new Car("black",10);
        car.setColor("white");
        System.out.println(car.getColor());

        System.out.println(car);

        }
    }
