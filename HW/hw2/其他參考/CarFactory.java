import java.util.Random;

public class CarFactory {
    private int numOfCars = 0;

    public int getProducedCars() {
        return numOfCars;
    }

    public Car produceCar() {
        Random random = new Random();
        String engineId = String.format("%08d", random.nextInt(100000000));
        String carId = "C" + generateRandomLetters(2) + "-" + String.format("%04d", random.nextInt(10000));
        String[] colors = {"White", "Black", "Blue"};
        String color = colors[random.nextInt(colors.length)];
        Car car = new Car(carId, engineId, color);
        numOfCars++;
        return car;
    }

    private String generateRandomLetters(int length) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            result.append(letters.charAt(random.nextInt(letters.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car1 = factory.produceCar();
        System.out.println("Car ID: " + car1.getCarId());
        System.out.println("Engine ID: " + car1.getEngineId());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Total Cars Produced: " + factory.getProducedCars());
    }
}
