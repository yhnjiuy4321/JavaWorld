public class Car {
    // 成員變數
    private String carId;
    private String engineId;
    private String color;

    // 建構方法
    public Car(String engineId) {
        this.engineId = engineId;
    }

    public Car(String carId, String engineId, String color) {
        this(engineId);
        this.carId = carId;
        this.color = color;
    }

    // 存取方法
    public String getEngineId() {
        return engineId;
    }

    public String getCarId() {
        return carId;
    }

    public String getColor() {
        return color;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 測試主方法
    public static void main(String[] args) {
        // 使用對engineId初始化的建構方法
        Car car1 = new Car("ENG123456");
        System.out.println("Car1 Engine ID: " + car1.getEngineId());

        // 使用對所有成員變數初始化的建構方法
        Car car2 = new Car("CAR123", "ENG654321", "Red");
        System.out.println("Car2 Car ID: " + car2.getCarId());
        System.out.println("Car2 Engine ID: " + car2.getEngineId());
        System.out.println("Car2 Color: " + car2.getColor());

        // 修改carId與color
        car2.setCarId("CAR789");
        car2.setColor("Blue");
        System.out.println("Car2 New Car ID: " + car2.getCarId());
        System.out.println("Car2 New Color: " + car2.getColor());
    }
}
