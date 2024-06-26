public class Main_Abstract {
    public static void main(String[] args) {

        /*
        abstract 抽象類別:
        可讓class建立abstract方法，但也可有一般方法
        */

        Animal animal = new Cat();
        Animal dog = new Dog();
        Animal cat = new SomeCat();
        cat.makesound();
        dog.makesound();
        animal.makesound();

    }
}
