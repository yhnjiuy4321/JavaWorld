public class student {

    int id;
    int age;
    String name;
    boolean gender;

    //若無任何方法(下方)，系統會自動預設一個空參數

    //空參數
    public student(){

    }

    //id參數
    public student(int id){
        this.id = id;

    }

    //所有參數
    public student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name =name;
    }

    void showInfo(){
        System.out.println(id+","+age+","+name+","+gender);
        }
    }


