public class teacher extends person {


    private int age;

    public teacher(String id, int age) {
        super(id);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    protected void sayHi() {
        System.out.println("hi~GUYS!");
    }
}



