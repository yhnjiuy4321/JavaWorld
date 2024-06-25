public class Main2 {
    public static void main(String[] args) {
        /*
        多型，指「同一個行為，但有不同的結果」，例如滑鼠左鍵點擊，有時點擊是確認事件，在遊戲就可能是
        射擊事件，但同樣都是滑鼠左鍵點擊，卻執行不一樣的內容，如此一來，可以讓我們更有彈性的設計，
        不會被侷限只能永遠特定型別才能被呼叫使用，而是可以不斷延伸擴展出來更多種型別。
        */

        Animal aaa=new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Toy toy = new Toy();
        Cow cow = new Cow();
        SmallDog smallDog = new SmallDog();

        Animal bbb = new Cat();
        Animal ccc = new Dog();
        Dog ddd = new SmallDog();

        //同一方法Sound，產生不同結果
        toy.Sound(dog); // ==dog.bark()
        toy.Sound(cow);
        toy.Sound(cat);
        toy.Sound(smallDog);
        toy.food(dog);
        toy.food(cow);//cow中無eat方法，所以無法輸出
        toy.Sound(aaa);//在Animal中有「System.out.println("WOWO")」
        bbb.bark();
        ccc.bark();
        ddd.bark();
    }
}
/*
上述例子中，可以看到不斷重複使用Sound、food、bark方法，但卻有不同的結果，這就是多型的概念
*/