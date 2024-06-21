public class intel_I3 implements Cpu{

    @Override
    public double pin1add(double a, double b) {
        System.out.println("performing addition operation slowly...");
        return a + b;
    }

    @Override
    public double pin2sub(double a, double b) {
        return a - b;
    }

    @Override
    public double pin3mul(double a, double b) {
        return a * b;
    }

    @Override
    public double pin4div(double a, double b) {
        return a / b;
    }
}
