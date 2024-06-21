public class Main2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello();

        Student student = new Student("123", "John");
        System.out.println(student);

        //toString()方法是Object的方法，所有類別都有(Object是所有類別的父類別)
        //toString()方法是用來回傳物件的字串表示
        //預設回傳的是物件的記憶體位址

        Student student2 = new Student("123", "John");
        System.out.println(student2);
        System.out.println(student == student2);//比較記憶體位址，不相等
        System.out.println(student.equals(student2));//比較內容，相等，因為覆寫了equals方法。

        int a = 10;
        Integer num1=a; //自動裝箱，將基本資料型態轉換成物件，稱為裝箱
        Integer num2=10;
        System.out.println(num1==num2); //true，因為Integer有快取池，範圍在-128~127，超過範圍就不會在快取池中，所以不相等。
        System.out.println(num1.equals(num2)); //true，因為覆寫了equals方法。

        //開箱舉例
        int b=num1; //自動開箱，將物件轉換成基本資料型態，稱為開箱


        Student[] students = {student, student2};
        System.out.println(student.getStudents(students));
        System.out.println(student.getStudents(student, student2));//可變參數，可以傳入不定數量的參數
    }
}
