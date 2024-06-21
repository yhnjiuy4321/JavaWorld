public class ElectricCarFactory extends CarFactory{
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
        return super.updateCarColor(car, color);
    }


    @Override
    public boolean updateCarId(Car car, String carId) {
        if (carId.matches("E[A-Z]{2}-\\d{4}")) {  // 符合 E[兩個英文]-[四個數字]
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

        carId.append('E');

        for (int i = 0; i < 2; i++) {
            carId.append((char) ('A'+random.nextInt(26)));
        }

        carId.append('-');
        for (int i = 0; i < 4; i++) {
            carId.append(random.nextInt(10));// 生成 0-9 之間的數字
        }
        return carId.toString();
    }


    @Override
    public String generateColor() {
        return super.generateColor();
    }
}
