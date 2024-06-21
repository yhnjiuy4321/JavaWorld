public class Car {

    private final String enginId;
    private String carId;
    private String engineId;
    private String color;

    public Car(String enginId) {
        this.enginId = enginId;
    }

    public Car(String carId, String enginId, String color) {
        this.carId = carId;
        this.enginId = enginId;
        this.color = color;
    }

    public String getEnginId() {
        return enginId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineId='" + engineId + '\'' +
                ", carId='" + carId + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}