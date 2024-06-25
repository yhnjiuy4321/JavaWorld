public class student extends person{

    private final int height;

    public student(String id, int height) {
        super(id);
        this.height= height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected void sayHi() {
        //super.sayHi();
        System.out.println("hi,teacher!");
    }
}
