public class ElectricCarFactory extends CarFactory {

  public Car produceCar() {
    String engineId = CarIdUtil.generateNumbers(8);
    String carId = CarIdUtil.generateElectricCarId();
    String color = generateColor();

    Car car = new Car(carId, engineId, color);
    setProducedCars(getProducedCars() + 1);
    return car;
  }

  public boolean updateCarId(Car car, String carId) {
    if (CarIdUtil.isValidElectricCarId(carId)) {
      car.setCarId(carId);
      return true;
    }
    return false;
  }


}
