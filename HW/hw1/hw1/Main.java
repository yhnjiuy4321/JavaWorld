import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CarFactory carFactory=new CarFactory();
        Car car=carFactory.produceCar();
        //produceCar()方法在CarFactory類中定義，用於創建並返回一個新的Car對象(produceCar()中的「return new Car(engineId, carId, color)」)

        System.out.println(car.getEnginId()+","+car.getCarId()+","+car.getColor());
        System.out.println(carFactory.getProduceCar());

        TaxiFatory taxiFatory=new TaxiFatory();
        Car car1=taxiFatory.produceCar();
        System.out.println(car1.getEnginId()+","+car1.getCarId()+","+car1.getColor());
        System.out.println(taxiFatory.getProduceCar());

        ElectricCarFactory electricCarFactory=new ElectricCarFactory();
        Car car2=electricCarFactory.produceCar();
        System.out.println(car2.getEnginId()+","+car2.getCarId()+","+car2.getColor());
        System.out.println(electricCarFactory.getProduceCar());

        System.out.println(carFactory.updateCarId(car2,"THJ-0097"));
        System.out.println(carFactory.updateCarColor(car,"red"));
        System.out.println(taxiFatory.updateCarColor(car,"Yellow"));
        System.out.println(electricCarFactory.updateCarColor(car2,"Blue"));


    }
}