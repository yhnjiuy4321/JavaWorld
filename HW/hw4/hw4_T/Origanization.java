import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Origanization {

  private Map<String, Map<String, Car>> cars = new LinkedHashMap<>();
  private Map<String, Car> whiteCars = new TreeMap<>();
  private Map<String, Car> blackCars = new TreeMap<>();
  private Map<String, Car> blueCars = new TreeMap<>();
  private Map<String, Car> yellowCars = new TreeMap<>();

  public Origanization() {
    cars.put("White", whiteCars);
    cars.put("Black", blackCars);
    cars.put("Blue", blueCars);
    cars.put("Yellow", yellowCars);
  }

  public void buyCar(Car car) {
    if (car.getColor().equals(CarFactory.COLORS[0])) {
      whiteCars.put(car.getEngineId(), car);
    } else if (car.getColor().equals(CarFactory.COLORS[1])) {
      blackCars.put(car.getEngineId(), car);
    } else if (car.getColor().equals(CarFactory.COLORS[2])) {
      blueCars.put(car.getEngineId(), car);
    } else if (car.getColor().equals("Yellow")) {
      yellowCars.put(car.getEngineId(), car);
    }
  }

  public int getNumOfWhiteCars() {
    return whiteCars.size();
  }

  public int getNumOfBlackCars() {
    return blackCars.size();
  }

  public int getNumOfBlueCars() {
    return blueCars.size();
  }

  public int getNumOfYellowCars() {
    return yellowCars.size();
  }

  public void printAllWhiteCars() {
    printAllCars(whiteCars);
  }

  public void printAllBlackCars() {
   printAllCars(blackCars);
  }

  public void printAllBlueCars() {
    printAllCars(blueCars);
  }

  public void printAllYellowCars() {
    printAllCars(yellowCars);
  }

  private void printAllCars(Map<String, Car> cars) {
    Set<String> engineIds = cars.keySet();
    for(String engineId: engineIds) {
      Car car = cars.get(engineId);
      System.out.println(engineId + ", " + car.getCarId() + ", " + car.getColor());
    }
  }
}
