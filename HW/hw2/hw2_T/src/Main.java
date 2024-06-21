public class Main {
  public static void main(String[] args) {

    Origanization org = new Origanization();

    CarFactory carFactory = new CarFactory();
    TaxiFactory taxiFactory = new TaxiFactory();
    ElectricCarFactory electricCarFactory = new ElectricCarFactory();

    for(int i=0;i<3;i++) {
      Car car = carFactory.produceCar();
      System.out.println(car);
      org.buyCar(car);
    }

    for(int i=0;i<2;i++) {
      Car car = taxiFactory.produceCar();
      System.out.println(car);
      org.buyCar(car);
    }

    for(int i=0;i<5;i++) {
      Car car = electricCarFactory.produceCar();
      System.out.println(car);
      org.buyCar(car);
    }

    System.out.println("White cars: " + org.getNumOfWhiteCars());
    System.out.println("Black cars: " + org.getNumOfBlackCars());
    System.out.println("Blue cars: " + org.getNumOfBlueCars());
    System.out.println("Yellow cars: " + org.getNumOfYellowCars());


  }
}