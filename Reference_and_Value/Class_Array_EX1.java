public class Class_Array_EX1 {
    public static void main(String[] args) {

        aStudent[] students=new aStudent[18];
        //創建一個aStudent類型的陣列students，此陣列有18個元素，用於儲存student類別的實例
        //陣列裡面的每個元素都是null，因為我們還沒有為它們分配任何值

        /*每隔車廂塞物件*/
        for (int i=0;i<students.length;i++){
            aStudent student=new aStudent();
            //設一個aStudent類型的變數student
            //「new aStudent()」對aStudent類別構造函數的呼叫。括號表示無參數構造函數的調用，這意味著我們正在創建一個沒有初始值的student對象，它的屬性將被設定為預設值（如果類別定義中有預設值的話）。

            //將每個車廂分配數值
            student.id=i+1;//id從1開始，但陣列是從0開始
            student.age=18;
            students[i]= student;
        }
        /*把每個物件讀取出來*/
        for(aStudent studentY:students){
            System.out.println(studentY.id+","+studentY.age);
        }
    }
}
