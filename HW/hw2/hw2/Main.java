//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //HW1

        CarFactory carFactory=new CarFactory();
        Car car=carFactory.produceCar();
        //produceCar()方法在CarFactory類中定義，用於創建並返回一個新的Car對象(produceCar()中的「return new Car(engineId, carId, color)」)

        System.out.println(car.getEnginId()+","+car.getCarId()+","+car.getColor());
        System.out.println(carFactory.getProduceCar());

        TaxiFactory taxiFatory=new TaxiFactory();
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
        System.out.println();



        //HW2

        Organization organization = new Organization();

        // 購買汽車
        CarFactory carF = new CarFactory();
        for (int i = 0; i < 3; i++) { // 生成3輛Car
            Car carA = carF.produceCar();
            organization.buyCar(carA); //這裡的buyCar()方法在Organization類中定義，執行switch(car.getColor())，也就是車的顏色增加相應顏色的車數量
        }

        TaxiFactory taxiF = new TaxiFactory();
        for (int i = 0; i < 2; i++) { // 生成2輛TaxiCar
            Car carB = taxiF.produceCar();
            organization.buyCar(carB);
        }

        ElectricCarFactory electricCarF = new ElectricCarFactory();
        for (int i = 0; i < 5; i++) { // 生成5輛ElectricCar
            Car carC = electricCarF.produceCar();
            organization.buyCar(carC);
        }

        // 輸出各種顏色的汽車數量
        System.out.println("White cars: " + organization.getNumOfWhiteCars()); //這裡的getNumOfWhiteCars()方法在Organization類中定義，用於取得白色車輛總數
        System.out.println("Black cars: " + organization.getNumOfBlackCars());
        System.out.println("Blue cars: " + organization.getNumOfBlueCars());
        System.out.println("Yellow cars: " + organization.getNumOfYellowCars());




    }
}