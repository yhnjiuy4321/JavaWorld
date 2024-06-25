public class person {

    private String id;

    // 父類的構造器
    public person(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    protected int age;

    protected void sayHi() {
        System.out.println("hi everyone!");
    }
}



