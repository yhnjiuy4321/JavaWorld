public class TaxiFactory extends CarFactory{

    private static final String[] COLORS = {"Yellow", "Yellow", "Yellow"};


    @Override
    public int getProducedCars(int numOfCar) {
        return super.getProducedCars(numOfCar);
    }


    @Override
    public Car produceCar() {
        return super.produceCar();
    }


    @Override
    public int getProduceCar() {
        return super.getProduceCar();
    }


    @Override
    public boolean updateCarColor(Car car, String color) {

        car.setColor(color);
        if (color.equals(COLORS[0])) {
            return true;
        }
        return false;
    }


    @Override
    public boolean updateCarId(Car car, String carId) {
        if (carId.matches("T[A-Z]{2}-\\d{4}")) {  // 符合 T[兩個英文]-[四個數字]
            car.setCarId(carId);
            return true;
        }
        return false;
    }


    @Override
    public String generateEngineId() {
        return super.generateEngineId();
    }


    @Override
    public String generateCarId() {

        StringBuilder carId = new StringBuilder();
        carId.append('T');
        for (int i = 0; i < 2; i++) {
            carId.append((char) ('A'+random.nextInt(26)));
        }
        carId.append('-');
        for (int i = 0; i < 4; i++) {
            carId.append(random.nextInt(10));
        }
        return carId.toString();
    }


    @Override
    public String generateColor() {
        int index = random.nextInt(COLORS.length);  // 在 COLORS 陣列中隨機選擇一個顏色
        return COLORS[index];
    }
}
