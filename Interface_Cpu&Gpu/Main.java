public class Main {
    public static void main(String[] args) {

        //建立兩顆不同的cpu
        Cpu cpu1 = new intel_I3();
        Cpu cpu2 = new intel_I9();

        /*
        匿名類別:
        1.不用再寫一個新的類別，直接在這裡實作，但仍須遵守介面(或類別)的規範
        2.無法在其他地方引用或重複使用
        3.通常用於臨時的、簡單的、只用一次的類別
        */
        Cpu cpu3 = new Cpu() {
            @Override
            public double pin1add(double a, double b) {
                System.out.println("performing CPU3");
                return a+b*1.5;
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

        //建立三塊相同主機板(名子不同)
        MainBoard mb1 = new AcerMAINboard();
        MainBoard mb2 = new AcerMAINboard();
        MainBoard mb3 = new AcerMAINboard();


        System.out.println("主機版加CPU:");
        System.out.println("CPU1:");
        mb1.addCpu(cpu1);//插入cpu1才能computeAdd
        mb1.computeAdd();
        System.out.println("\nCPU2:");
        mb2.addCpu(cpu2);//插入cpu2才能computeAdd
        mb2.computeAdd();
        System.out.println("\nCPU3:");
        mb3.addCpu(cpu3);//插入cpu3才能computeAdd(cpu3是匿名類別)
        mb3.computeAdd();


        System.out.println("\n主機版加VGA:");

        //建立一塊Nvidia顯示卡
        Vga vga1 = new NvidiaVgaCard();
        //Vga是介面，也可用來當屬性

        System.out.println("mb1:");
        mb1.drawGraph();//mb1是i3，沒有vga，所以會顯示no vga
        mb1.addVga(vga1);//mb1插入vga1
        mb1.drawGraph();//mb1有vga1，所以會顯示NvidiaVgaCard is displaying...
        System.out.println("\nmb2:");
        mb2.drawGraph();//mb2是i9，本身有vga，但不是Nvidia，所以顯示I9 is displaying...
        mb2.addVga(vga1);//mb2插入vga1
        mb2.drawGraph();//mb2有vga1，所以會顯示NvidiaVgaCard is displaying...
    }
}