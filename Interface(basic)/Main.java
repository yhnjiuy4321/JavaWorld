//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Animal animal = new Cat();
        Animal dog = new Dog();
        Animal cat = new SomeCat();
        cat.makesound();
        dog.makesound();
        animal.makesound();

        Animal2 poppy = new poppy();
        poppy.makesound();
        poppy.eat();
        Animal2 kitty = new Kitty();
        kitty.makesound();
        kitty.eat();



    }
}

//介面與介面之間用implements
//介面與類別之間用extends