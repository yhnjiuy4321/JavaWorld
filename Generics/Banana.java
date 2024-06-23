public class Banana extends Fruit{

    public Banana(String color, int weight, int price, String origin) {
        super(color, weight, price, origin);
    }

    public void print() {
        System.out.println("Banana: "+getColor()+","+getWeight()+","+getPrice()+","+getOrigin());
    }
}
