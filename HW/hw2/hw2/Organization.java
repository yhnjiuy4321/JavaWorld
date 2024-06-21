public class Organization {

    private int numOfWhiteCars;  // 白車數量
    private int numOfBlackCars;  // 黑車數量
    private int numOfBlueCars;   // 藍車數量
    private int numOfYellowCars; // 黃車數量

    // 計算各顏色車的數量
    public void buyCar(Car car) {

        // 根據車的顏色，增加相應顏色的車數量
        switch (car.getColor()) { // 這裡的getColor()方法在Car類中定義，用於獲取車的顏色
            case "White":// 當車的顏色是白色時，白車數量加1(下面依此類推)
                numOfWhiteCars++;
                break;
            case "Black":
                numOfBlackCars++;
                break;
            case "Blue":
                numOfBlueCars++;
                break;
            case "Yellow":
                numOfYellowCars++;
                break;
            default:
                break;
        }
    }

    //獲取白色車輛數量
    public int getNumOfWhiteCars() {
        return numOfWhiteCars;
    }

    // 獲取黑色車輛數量
    public int getNumOfBlackCars() {
        return numOfBlackCars;
    }

    // 獲取藍色車輛數量
    public int getNumOfBlueCars() {
        return numOfBlueCars;
    }

    // 獲取黃色車輛數量
    public int getNumOfYellowCars() {
        return numOfYellowCars;
    }

}
