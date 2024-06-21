public class Main {
  public static void main(String[] args) {

    Origanization org = new Origanization();

    CarFactory carFactory = new CarFactory() {
      @Override
      public boolean updateCarId(Car car, String carId) {
        return false;
      }
    };
    TaxiFactory taxiFactory = new TaxiFactory();
    ElectricCarFactory electricCarFactory = new ElectricCarFactory();

    for(int i=0;i<3;i++) {
      Car car = carFactory.produceCar();
      //System.out.println(car);
      org.buyCar(car);
    }

    for(int i=0;i<2;i++) {
      Car car = taxiFactory.produceCar();
      //System.out.println(car);
      org.buyCar(car);
    }

    for(int i=0;i<5;i++) {
      Car car = electricCarFactory.produceCar();
      //System.out.println(car);
      org.buyCar(car);
    }

    System.out.println("White_cars: " + org.getNumOfWhiteCars());
    org.printAllWhiteCars();

    System.out.println("Black_cars: " + org.getNumOfBlackCars());
    org.printAllBlackCars();

    System.out.println("Blue_cars: " + org.getNumOfBlueCars());
    org.printAllBlueCars();

    System.out.println("Yellow_cars: " + org.getNumOfYellowCars());
    org.printAllYellowCars();


  }
}