public class TaxiFactory extends CarFactory{
  @Override
  public Car produceCar() {
    String engineId = CarIdUtil.generateNumbers(8);
    String carId = CarIdUtil.generateTaxiId();
    String color = generateColor();

    Car car = new Car(carId, engineId, color);
    setProducedCars(getProducedCars() + 1);
    return car;
  }

  @Override
  protected String generateColor() {
    return "Yellow";
  }

  @Override
  public boolean updateCarId(Car car, String carId) {
    if(CarIdUtil.isValidTaxiId(carId)) {
      car.setCarId(carId);
      return true;
    }
    return false;
  }

  @Override
  public boolean updateCarColor(Car car, String color) {
    return false;
  }

  public static void main(String[] args) {
    TaxiFactory factory = new TaxiFactory();
    Car car1 = factory.produceCar();
    System.out.println(car1);

    Car car2 = factory.produceCar();

    System.out.println(factory.updateCarId(car1, "TAB-123"));
    System.out.println(factory.getProducedCars());
  }
}
