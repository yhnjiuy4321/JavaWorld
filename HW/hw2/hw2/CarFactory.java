import java.util.Random;

class CarFactory {
    static final Random random = new Random();
    private static final String[] COLORS = {"White", "Black", "Blue"};
    /*
        private:限制訪問範圍，只能在該類內部訪問。
        static:表示這個變量是屬於類的，而不是某個具體的對象。所有這個類的對象共享這個變量。
        final:表示這個變量在初始化後不能被重新賦值。

        COLORS陣列是不可變的，意味著你不能重新賦值COLORS變量本身，也就是說，你不能將COLORS指向另一個陣列。
        但是陣列的元素是可以被修改的。

       Ex:
       COLORS = new String[]{"Red", "Green", "Blue"};  // 這行會編譯錯誤，因為 COLORS 是 final 的
       COLORS[0] = "Red";  // 這行是可行的，因為修改的是陣列中的元素，而不是陣列本身
    */


    int numOfCar;


    public  String generateEngineId() {

        StringBuffer engineId1 = new StringBuffer(8);
        for (int i = 0; i < 8; i++) {
            engineId1.append(random.nextInt(10));// 生成 0-9 之間的數字
        }
        return engineId1.toString();
    }


    public  String generateCarId() {
        StringBuilder carId = new StringBuilder();
        carId.append('C');
        for (int i = 0; i < 2; i++) {
            carId.append((char) ('A'+random.nextInt(26)));  // 生成 A-Z 之間的字母
        }
        /*
        1.「random.nextInt(26)」生成一個從 0 到 25 的隨機整數。

        2.char類型的 'A' 在 ASCII 表中的數值是 65。將這個數值加上 0 到 25 的隨機整數，
        結果會是一個從 65 到 90 的整數，這些整數對應於 ASCII 表中的大寫字母 A 到 Z。

        3.將計算結果轉換回 char 類型，這樣我們就得到了隨機的大寫字母。
        (不轉換的話，「'A'+random.nextInt(26)」會是int。)
      */

        carId.append('-');
        for (int i = 0; i < 4; i++) {
            carId.append(random.nextInt(10));// 生成 0-9 之間的數字
        }
        return carId.toString();
    }


    // 隨機選擇一個顏色
    public  String generateColor() {
        int index = random.nextInt(COLORS.length);  // 在 COLORS 陣列中隨機選擇一個顏色
        return COLORS[index];
    }


    public int getProducedCars(int numOfCar) {
        return numOfCar;
    }


    public Car produceCar() {

        String engineId = generateEngineId();
        String carId = generateCarId();
        String color = generateColor();
        numOfCar++;
        return new Car(engineId, carId, color);
        //(X)return Car(engineId, carId, color)--->必須使用new字。這是因為new字負責調用構造函數並分配內存來創建新對象
    }


    public int getProduceCar() {
        return numOfCar;
    }


    public  boolean updateCarId(Car car, String carId){
        if (carId.matches("C[A-Z]{2}-\\d{4}")) {  // 符合 C[兩個英文]-[四個數字]
            car.setCarId(carId);
            return true;
        }
        return false;
    }


    public  boolean updateCarColor(Car car, String color){
        car.setColor(color);
            if (color.equals(COLORS[0]) || color.equals(COLORS[1]) || color.equals(COLORS[2])) { //只要符合其中一顏色即為true
                return true;
            }
        return false;
    }
}