import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input Year,Month,Day：");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();


        int[] LeapYear = new int[51];
        int i;
        boolean isLeapYear = true;


        while (true) {

            if (year <= 1811 || year >= 2013) {
                System.out.println("範圍有誤，只能輸入1812年到2012年");
                break;
            } else {
                for (i = 0; i < 51; i++) {
                    LeapYear[i] = 1812 + i * 4;
                    if (year != LeapYear[i] || year == 1900) {
                        isLeapYear = false;
                    } else if (year == LeapYear[i]) {
                        isLeapYear = true;
                        break;
                    }
                }
            }

            if (isLeapYear) {
                if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
                    day = day + 1;
                    if (day == 32) {
                        month = month + 1;
                        day = day - 31;
                        if (month == 13) {
                            year = year + 1;
                            month = 1;
                        }
                    }
                    System.out.println("The next day is " + year + "/" + month + "/" + day);
                    break;

                } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
                    day = day + 1;
                    if (day == 31) {
                        month = month + 1;
                        day = 1;
                    }
                    System.out.println("The next day is " + year + "/" + month + "/" + day);
                    break;

                } else if (month == 2 && day < 30) {
                    day = day + 1;
                    if (day == 30) {
                        month = month + 1;
                        day = 1;
                    }
                    System.out.println("The next day is " + year + "/" + month + "/" + day);
                    break;

                } else {
                    System.out.println("日期有誤");
                    break;
                }

            } else if (!isLeapYear) {
                if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
                    day = day + 1;
                    if (day == 32) {
                        month = month + 1;
                        day = 1;
                        if (month == 13) {
                            year = year + 1;
                            month = 1;
                        }
                    }
                    System.out.println("The next day is " + year + "/" + month + "/" + day);
                    break;

                } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
                    day = day + 1;
                    if (day == 31) {
                        month = month + 1;
                        day = 1;
                    }
                    System.out.println("The next day is " + year + "/" + month + "/" + day);
                    break;

                } else if (month == 2 && day <= 28) {
                    day = day + 1;
                    if (day == 29) {
                        month = month + 1;
                        day = 1;
                    }
                    System.out.println("The next day is " + year + "/" + month + "/" + day);
                    break;

                }
                System.out.println("日期有誤");
                break;
            }
        }
    }
}








/*

else {
System.out.println("範圍有誤，只能顯示1812年到2012年");
}

*/



 //System.out.println("The next day is " + year + "/" + month + "/" + day);