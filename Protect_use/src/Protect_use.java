//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class CCoin extends CCircle{

    public CCoin(double r)
    {
        radius=r;      // 直接取用父類別的protected成員
    }
}

class CCircle {

    protected static double pi=3.14;   // 宣告為protected
    protected double radius;   // 宣告為protected

    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }
}

public class Protect_use {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CCoin coin=new CCoin(2);
        coin.show();
    }
}
