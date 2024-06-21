import java.util.Random;

public class ElectricCarFactory {
    private int numOfCars = 0;

    public int getProducedCars() {
        return numOfCars;
    }

    public Car produceCar() {
        Random random = new Random();
        String engineId = String.format("%08d", random.nextInt(100000000));
        String carId = generateCarId();
        String color = generateColor();
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

    public boolean updateCarColor(Car car, String color) {
        if (isValidColor(color)) {
            car.setColor(color);
            return true;
        }
        return false;
    }

    private boolean isValidCarId(String carId) {
        return carId.matches("E[A-Z]{2}-\\d{4}");
    }

    private boolean isValidColor(String color) {
        return color.equals("White") || color.equals("Black") || color.equals("Blue");
    }

    private String generateCarId() {
        Random random = new Random();
        char letter1 = (char) ('A' + random.nextInt(26));
        char letter2 = (char) ('A' + random.nextInt(26));
        int number = random.nextInt(10000);
        return String.format("E%c%c-%04d", letter1, letter2, number);
    }

    private String generateColor() {
        String[] colors = {"White", "Black", "Blue"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
