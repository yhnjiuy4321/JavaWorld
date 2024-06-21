import java.util.Random;

public class TaxiFactory {
    private int numOfCars = 0;

    public int getProducedCars() {
        return numOfCars;
    }

    public Car produceCar() {
        Random random = new Random();
        String engineId = String.format("%08d", random.nextInt(100000000));
        String carId = generateCarId();
        String color = "Yellow";
        Car car = new Car(carId, engineId, color);
        numOfCars++;
        return car;
    }

    public boolean updateCarId(Car car, String carId) {
        if (isValidCarId(carId)) {
            car.setCarId(carId);
            return true;
        }
        return false;
    }

    private boolean isValidCarId(String carId) {
        return carId.matches("T[A-Z]{2}-\\d{3}");
    }

    private String generateCarId() {
        Random random = new Random();
        char letter1 = (char) ('A' + random.nextInt(26));
        char letter2 = (char) ('A' + random.nextInt(26));
        int number = random.nextInt(1000);
        return String.format("T%c%c-%03d", letter1, letter2, number);
    }
}
