public class MainForTC {
    public static void main(String[] args) {

        TempertureConverter test=new TempertureConverter();
        //需先建立類別為TempertureConverter的物件(test)，才能使用裡面的方法


        System.out.println("華氏轉攝氏: "+test.convertToC(100));
        System.out.println("攝氏轉華氏: "+test.convertToF(36));
    }
}
