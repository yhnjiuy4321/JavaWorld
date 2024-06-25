import java.util.Scanner;

public class id_email_pwse_Input {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("請輸入身分證: ");
        String id = sc1.next();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("請輸入信箱: ");
        String email = sc2.next();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("請輸入密碼(長度8-10): ");
        String pswd = sc3.next();


        if (id.matches("[A-Z][1-2][0-9]{8}")) {
            if (email.matches("\\w+@(\\w+\\.)+\\w+")) {
                if (pswd.matches("\\w{8,10}") && pswd.matches(".*[a-zA-Z]+.*")&&pswd.matches(".*[\\d]+.*")) {
                       //長度8-10;要同時包含英文與數字
                        //「.」任意字元;「*」出現零次以上;「+」至少一次;「\\w」任意英文與數字;「\\.」--->點號

                        System.out.println("格式皆正確");
                }else {
                    System.out.println("密碼格式錯誤");
                }
            } else {
                System.out.println("信箱格式錯誤");
            }
        } else {
            System.out.println("身分證格式錯誤");
        }
    }
}