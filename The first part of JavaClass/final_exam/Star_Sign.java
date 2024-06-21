import java.util.*;

public class Star_Sign {
    public static void main(String args[]) {
        int a,b,x,y;

        System.out.print("Input your month of birth: ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();

        System.out.print("Input your day of birth: ");
        b = sc1.nextInt();

        switch (a){
            case 1:
                if(b>=21&&b<=31){
                    System.out.print("Aquarius");
                }
                if(b>=1&&b<=20){
                    System.out.print("Capricorn");
                }
                break;

            case 2:
                if(b>=1&&b<=18){
                    System.out.print("Aquarius");
                }
                if(b>=19&&b<=29){
                    System.out.print("Pisces");
                }
                break;

            case 3:
                if(b>=1&&b<=20){
                    System.out.print("Pisces");
                }
                if(b>=21&&b<=31){
                    System.out.print("Aries");
                }
                break;

            case 4:
                if(b>=1&&b<=20){
                    System.out.print("Aries");
                }
                if(b>=21&&b<=30){
                    System.out.print("Taurus");
                }
                break;

            case 5:
                if(b>=22&&b<=31){
                    System.out.print("Gemini");
                }
                if(b>=1&&b<=21){
                    System.out.print("Taurus");
                }
                break;


            case 6:
                if(b>=1&&b<=21){
                    System.out.print("Gemini");
                }
                if(b>=22&&b<=30){
                    System.out.print("Cancer");
                }
                break;

            case 7:
                if(b>=1&&b<=22){
                    System.out.print("Cancer");
                }
                if(b>=23&&b<=31){
                    System.out.print("Leo");
                }
                break;

            case 8:
                if(b>=1&&b<=23){
                    System.out.print("Leo");
                }
                if(b>=24&&b<=31){
                    System.out.print("Virgo");
                }
                break;

            case 9:
                if(b>=1&&b<=23){
                    System.out.print("Virgo");
                }
                if(b>=24&&b<=30){
                    System.out.print("Libra");
                }
                break;

            case 10:
                if(b>=1&&b<=23){
                    System.out.print("Libra");
                }
                if(b>=24&&b<=31){
                    System.out.print("Scorpio");
                }
                break;

            case 11:
                if(b>=1&&b<=22){
                    System.out.print("Scorpio");
                }
                if(b>=23&&b<=30){
                    System.out.print("Sagittarius");
                }
                break;

            case 12:
                if(b>=1&&b<=21){
                    System.out.print("Sagittarius");
                }
                if(b>=22&&b<=31){
                    System.out.print("Capricorn");
                }
                break;
        }
    }
}