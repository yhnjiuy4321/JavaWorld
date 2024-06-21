public class ElectricCarFactory extends CarFactory {

  public Car produceCar() {
    String engineId = CarIdUtil.generateNumbers(8);
    String carId = CarIdUtil.generateElectricCarId();
    String color = generateColor();

    Car car = new Car(carId, engineId, color);
    getProducedCars().add(car);
    return car;
  }

  public boolean updateCarId(Car car, String carId) {
    try {
      CarIdUtil.isValidElectricCarId(carId);
      car.setCarId(carId);
      return true;
    } catch (InvalidCarIdException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }


}
