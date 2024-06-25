public class Toy {
    /*
    public void Sound(Cat cat) {
        cat.bark();
    }

    public void Sound(Dog dog) {
        dog.bark();
    }

    public void Sound(Cow cow) {
        cow.bark();
    }
     */

    public void Sound(Animal animal) {
        animal.bark();
        System.out.println("WOWO");
    }

    public void food(Animal animal) {
        animal.eat();
    }
}
