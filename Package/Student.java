public class Student {

    private String sId;
    private String name;

    public Student(String sId, String name) {
        this.sId = sId;
        this.name = name;
    }

    /*
    public int getStudents(Student[] students) {
        return students.length;
    }
     */
    public int getStudents(Student... students) {//可變參數，可以傳入不定數量的參數，「...」 代表不定數量的參數
        return students.length;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                '}';

        //toString()被覆寫，回傳的是Student的屬性
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){ //instanceof是用來判斷物件是否為某個類別的實例

            Student otherstudent = (Student) obj;
            //強制轉型，將obj轉型成Student，因為我們要比較的是Student的屬性，所以要轉型成Student，才能取得Student的屬性。
            //otherstudent是obj的Student形態，可以取得Student的屬性。

            if (this.getsId().equals(otherstudent.getsId()) ) {
                return true;
            }
        }
        return false;
    }
}
