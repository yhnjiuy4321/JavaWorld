//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        student tom = new student("S001",183);//設tom的id=T001
        tom.setId("SS001");//重新設定id
        System.out.println("tom:"+tom.getId()+","+tom.getHeight());//輸出id
        tom.sayHi();

        System.out.println();

        student ken = new student("S002",170);
        System.out.println("ken:"+ken.getId()+","+ken.getHeight());
        System.out.println("==================");

        
        Car mycar = new Car("TOYOTA", 4,"white",10);
        System.out.println(mycar);//透過toString輸出
        mycar.setBrand("Benz");//重新設定品牌
        System.out.println("品牌:"+mycar.getBrand());//輸出
        System.out.println("門數:"+mycar.getDoors());//輸出

        System.out.println("==================");

        Vehicle car2 = new Vehicle("TOYOTA",2);
        System.out.println(car2);
        mycar.setDoors(6);
        System.out.println("門數:"+mycar.getDoors());
        System.out.println("顏色:"+mycar.getColor());
        mycar.showAge();

        int x=10;

        System.out.println("==================");
        teacher ccc=new teacher("T001",25);
        System.out.println("老師年紀:"+ccc.getAge());
        ccc.sayHi();
    }
}
