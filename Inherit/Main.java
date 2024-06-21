//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        teacher tom = new teacher("T001");//設tom的id=T001
        tom.setId("TT001");//重新設定id
        System.out.println(tom.getId());//輸出id


        tom.sayHi();

        student ken = new student("S001",170);
        ken.setId("ken");
        System.out.println(ken.getId()+","+ken.getHeight());


        teacher joe = new teacher("T003");
        joe.setId("joe");


        Car mycar = new Car("TOYOTA", 4,"white",10);
        System.out.println(mycar);//會出現看不懂得編碼
        mycar.setBrand("Benz");//重新設定品牌
        System.out.println(mycar.getBrand());//輸出
        Vehicle car2 = new Vehicle("TOYOTA",2);
        System.out.println(car2.getDoors());
        System.out.println(mycar.getDoors());
        mycar.setDoors(3);
        System.out.println(mycar.getDoors());
        System.out.println(mycar.getColor());
        mycar.showAge();

        int x=10;

        teacher ccc=new teacher("CCC");
        ccc.add(x);
        System.out.println(x);


    }

}
