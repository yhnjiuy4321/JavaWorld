public class Apple extends Fruit{

    public Apple(String color, int weight, int price, String origin) {
        super(color, weight, price, origin);
    }

    public void print() {
        System.out.println("Apple: "+getColor()+","+getWeight()+","+getPrice()+","+getOrigin());
    }

}
