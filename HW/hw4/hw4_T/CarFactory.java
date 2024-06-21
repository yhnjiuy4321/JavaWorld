import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    private List<Car> numOfCars;

    public CarFactory() {
        numOfCars = new ArrayList<>();
    }

    public static final String[] COLORS = {"White", "Black", "Blue"};

    public List<Car> getProducedCars() {
        return numOfCars;
    }

    public void setProducedCars(List<Car> numOfCars) {
        this.numOfCars = numOfCars;
    }

    public Car produceCar() {
        String engineId = CarIdUtil.generateNumbers(8);
        String carId = CarIdUtil.generateCarId();
        String color = generateColor();

        Car car = new Car(carId, engineId, color);
        //numOfCars++;
        numOfCars.add(car);
        return car;
    }

    public boolean updateCarId(Car car, String carId) {
        try {
            CarIdUtil.isValidCarId(carId);
            car.setCarId(carId);
            return true;
        } catch (InvalidCarIdException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateCarColor(Car car, String color) {
        for(String aColor: CarFactory.COLORS) {
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
        int colorIndex = (int)(Math.random() * CarFactory.COLORS.length);
        String color = CarFactory.COLORS[colorIndex];
        return color;
    }
}

