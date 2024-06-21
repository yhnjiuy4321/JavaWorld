public class Car {

    private String color;

    private int id;

    public Car(String color, int id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}
