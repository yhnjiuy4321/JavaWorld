public class CarFactory {
  private int numOfCars;
  public static final String[] CAR_COLORS = {"White", "Black", "Blue"};

  public int getProducedCars() {
    return numOfCars;
  }

  public void setProducedCars(int numOfCars) {
    this.numOfCars = numOfCars;
  }

  public Car produceCar() {
    String engineId = CarIdUtil.generateNumbers(8);
    String carId = CarIdUtil.generateCarId();
    String color = generateColor();

    Car car = new Car(carId, engineId, color);
    numOfCars++;
    return car;
  }

  public boolean updateCarId(Car car, String carId) {
    if(CarIdUtil.isValidCarId(carId)) {
      car.setCarId(carId);
      return true;
    }
    return false;
  }

  public boolean updateCarColor(Car car, String color) {
    for(String aColor: CarFactory.CAR_COLORS) {
      if (aColor.equals(color)) {
        car.setColor(color);
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    CarFactory factory = new CarFactory();
    Car car1 = factory.produceCar();
    System.out.println(car1);

    System.out.println(factory.updateCarId(car1, "CAB-1234"));
  }

  protected String generateColor() {
    int colorIndex = (int)(Math.random() * CarFactory.CAR_COLORS.length);
    String color = CarFactory.CAR_COLORS[colorIndex];
    return color;
  }
}
