public class Main_Interface {
    public static void main(String[] args) {
        
        /*
        interface 介面:
        用來建立一堆方法，而不提供具體實現，
        換言之，無須定義這些方法如何實現，讓實現這個介面的類別去實現這些方法。
        用法:implements
        */

        Poppy poppy = new Poppy();
        poppy.makesound();
        poppy.eat();
        Poppy kitty = new Kitty();
        kitty.makesound();
        kitty.eat();
    }
}

