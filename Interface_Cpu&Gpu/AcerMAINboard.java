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
            //instanceof用於檢查一個物件是否是特定類型（類別或介面）的實例。
            //這裡是檢查cpu是否是Vga的實例(這裡是指i9 cpu是否內建vga功能)

                Vga vgaX = (Vga) cpu;
                //亦同 ---> ((Vga) cpu).display();

                /*
                原先的i9 cpu的屬性是CPU(Cpu cpu2 = new intel_I9())，所以無法直接呼叫display()方法
                但是因為i9 cpu實作了Vga介面，所以可以將cpu轉型成Vga介面，才能呼叫display()方法
                */

                vgaX.display();

            }else {
                System.out.println("no vga");
            }
        }else{
            vga.display();
            //若已有vga，則直接呼叫該vga的display()方法
        }
    }
}
