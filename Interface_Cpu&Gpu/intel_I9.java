public class intel_I9 implements Cpu,Vga{
    @Override
    public double pin1add(double a, double b) {
        System.out.println("performing addition operation quickly...");
        return a*b;
    }

    @Override
    public double pin2sub(double a, double b) {
        return 0;
    }

    @Override
    public double pin3mul(double a, double b) {
        return 0;
    }

    @Override
    public double pin4div(double a, double b) {
        return 0;
    }

    @Override
    public void display() { //I9有vga功能
        System.out.println("I9 is displaying...");
    }
}
