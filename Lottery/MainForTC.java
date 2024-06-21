public class MainForTC {
    public static void main(String[] args) {

        TempertureConverter test=new TempertureConverter();


        System.out.println("華氏轉攝氏: "+test.convertToC(90));
        System.out.println("攝氏轉華氏: "+test.convertToF(36));

    }
}
