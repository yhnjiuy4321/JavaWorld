public  class  Dog extends Animal {

    @Override
    public  void makesound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
