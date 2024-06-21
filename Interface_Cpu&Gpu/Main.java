//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cpu cpu1 = new intel_I3();
        Cpu cpu2 = new intel_I9();

        //匿名類別，不用再寫一個新的類別，直接在這裡實作，只能用一次
        Cpu cpu3 = new Cpu() {
            @Override
            public double pin1add(double a, double b) {
                System.out.println("performing CPU3");
                return 0;
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
        };



        MainBoard mb1 = new AcerMAINboard();
        MainBoard mb2 = new AcerMAINboard();
        MainBoard mb3 = new AcerMAINboard();


        mb1.addCpu(cpu1);//插入cpu1才能computeAdd
        mb1.computeAdd();
        mb2.addCpu(cpu2);//插入cpu2才能computeAdd
        mb2.computeAdd();

        Vga vga1 = new NvidiaVgaCard();

        mb1.drawGraph();//mb1是i3，沒有vga，所以會顯示no vga
        mb1.addVga(vga1);//mb1插入vga1
        mb1.drawGraph();//mb1有vga1，所以會顯示NvidiaVgaCard is displaying...
        mb2.drawGraph();//mb2是i9，本身有vga，但不是Nvidia，所以顯示I9 is displaying...

        mb2.addVga(vga1);//mb2插入vga1
        mb2.drawGraph();//mb2有vga1，所以會顯示NvidiaVgaCard is displaying...

        mb3.addCpu(cpu3);//插入cpu3才能computeAdd
        mb3.computeAdd();
        mb3.addCpu(cpu3);//插入cpu3才能computeAdd
        mb3.computeAdd();

    }
}