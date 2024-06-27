import java.io.Serializable;

//引入Serializable類別，用來序列化物件，使物件可以被序列化，才能在不同的檔案中讀取或寫入物件

public class Student implements Serializable {

    private String name;
    private String id;
    private String department;
    private int age;

    public Student(String name, String id, String department, int age) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}
