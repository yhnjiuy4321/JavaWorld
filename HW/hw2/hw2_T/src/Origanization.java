public class Origanization {

  private int numOfWhiteCars;
  private int numOfBlackCars;
  private int numOfBlueCars;
  private int numOfYellowCars;

  public void buyCar(Car car) {
    if (car.getColor().equals(CarFactory.CAR_COLORS[0])) {
      numOfWhiteCars++;
    } else if (car.getColor().equals(CarFactory.CAR_COLORS[1])) {
      numOfBlackCars++;
    } else if (car.getColor().equals(CarFactory.CAR_COLORS[2])) {
      numOfBlueCars++;
    } else if (car.getColor().equals("Yellow")) {
      numOfYellowCars++;
    }
  }

  public int getNumOfWhiteCars() {
    return numOfWhiteCars;
  }

  public int getNumOfBlackCars() {
    return numOfBlackCars;
  }

  public int getNumOfBlueCars() {
    return numOfBlueCars;
  }

  public int getNumOfYellowCars() {
    return numOfYellowCars;
  }
}
