public class Main {
    public static void main(String[] args) {
        // 创建 Organization 对象
        Organization organization = new Organization();

        // 购买车辆
        CarFactory carFactory = new CarFactory();
        for (int i = 0; i < 3; i++) {
            Car car = carFactory.produceCar();
            organization.buyCar(car);
        }

        TaxiFactory taxiFactory = new TaxiFactory();
        for (int i = 0; i < 2; i++) {
            Car car = taxiFactory.produceCar();
            organization.buyCar(car);
        }

        ElectricCarFactory electricCarFactory = new ElectricCarFactory();
        for (int i = 0; i < 5; i++) {
            Car car = electricCarFactory.produceCar();
            organization.buyCar(car);
        }

        // 打印各种车辆颜色数量
        System.out.println("White cars: " + organization.getNumOfWhiteCars());
        System.out.println("Black cars: " + organization.getNumOfBlackCars());
        System.out.println("Blue cars: " + organization.getNumOfBlueCars());
        System.out.println("Yellow cars: " + organization.getNumOfYellowCars());
    }
}
