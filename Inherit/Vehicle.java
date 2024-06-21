public class Vehicle {
    private String brand;
    private int doors;
    protected int age;


    // 父類的構造器
    public Vehicle(String brand ,int doors) {
        this.brand = brand;
        this.doors = doors;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    //protect的方法(放父類或放子類都可以)
    public void showAge(){
        System.out.println("CAR'S AGE: "+age);
    }



}

