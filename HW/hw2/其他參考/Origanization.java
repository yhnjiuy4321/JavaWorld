class Organization {
    // 成员变量
    private int numOfWhiteCars;  // 白色车辆数量
    private int numOfBlackCars;  // 黑色车辆数量
    private int numOfBlueCars;   // 蓝色车辆数量
    private int numOfYellowCars; // 黄色车辆数量

    // 构造方法
    public Organization() {
        // 初始化所有车辆数量为0
        numOfWhiteCars = 0;
        numOfBlackCars = 0;
        numOfBlueCars = 0;
        numOfYellowCars = 0;
    }

    // 成员方法

    // 添加购买的车辆
    public void buyCar(Car car) {
        // 根据车身颜色增加对应颜色的车辆数量
        switch (car.getColor()) {
            case "White":
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

    // 获取白色车辆数量
    public int getNumOfWhiteCars() {
        return numOfWhiteCars;
    }

    // 获取黑色车辆数量
    public int getNumOfBlackCars() {
        return numOfBlackCars;
    }

    // 获取蓝色车辆数量
    public int getNumOfBlueCars() {
        return numOfBlueCars;
    }

    // 获取黄色车辆数量
    public int getNumOfYellowCars() {
        return numOfYellowCars;
    }
}
