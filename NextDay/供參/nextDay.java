import java.util.Scanner;

public class nextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入年、月、日
        System.out.print("請輸入年份（1812-2012）：");
        int year = scanner.nextInt();
        System.out.print("請輸入月份（1-12）：");
        int month = scanner.nextInt();
        System.out.print("請輸入日期（1-31）：");
        int day = scanner.nextInt();

        // 檢查輸入是否在有效範圍內
        if (year < 1812 || year > 2012 || month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("error");
        } else {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // 調整閏年的二月天數
            if (isLeapYear(year)) {
                daysInMonth[1] = 29;
            }

            // 檢查輸入月份的日期是否有效
            if (day > daysInMonth[month - 1]) {
                System.out.println("error");
            } else {
                // 計算下一個日期
                if (day == daysInMonth[month - 1]) {
                    day = 1;
                    if (month == 12) {
                        month = 1;
                        year++;
                    } else {
                        month++;
                    }
                } else {
                    day++;
                }

                // 印出隔天日期
                System.out.println("隔天：" + year + "/" + month + "/" + day);
            }
        }

        scanner.close();
    }

    // 檢查年份是否是閏年
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}