public class AcerMAINboard implements MainBoard{


    private Cpu cpu;
    private Vga vga;

    @Override
    public void addCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public void computeAdd() {
        System.out.println(cpu.pin1add(10, 20));
    }



    @Override
    public void display() {

    }

    @Override
    public void addVga(Vga vga) {
        this.vga = vga;
    }

    @Override
    public void drawGraph() {
        if(vga == null){
            if(cpu instanceof Vga) {
                Vga vga = (Vga) cpu;
                vga.display();
            }else {
                System.out.println("no vga");
            }
        }else{
            vga.display();
        }
    }
}
