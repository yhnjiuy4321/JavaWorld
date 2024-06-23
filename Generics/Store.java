public class Store<X extends Fruit> {


    private X x;

    public Store(X x) {
        this.x = x;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public void print() {
        System.out.println(x.getColor()+","+x.getWeight()+","+x.getPrice()+","+x.getOrigin());
    }
}
