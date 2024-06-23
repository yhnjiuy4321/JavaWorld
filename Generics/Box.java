
public class Box<T,K> {

    private T t;
    private K k;

    public Box(T t, K k) {
        this.t = t;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public K getK() {
        return k;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void print() {
        System.out.println(t+","+k);
    }





}
