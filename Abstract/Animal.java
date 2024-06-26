public abstract class Animal {

    public abstract void makesound();//class須是abstract才能有abstract方法

    public void eat () { //非抽象方法，有實作，故當子類無定義他自己的方法時，會使用此方法
        System.out.println("Eating");
    }
}

