import java.util.Random;

public class CarIdUtil {

    // 隨機生成一個車牌號碼
    public static String generateCarId() {
        return "C" + generateRandomLetters(2) + "-" + generateRandomNumbers(4);
    }

    // 隨機生成一個計程車的車牌號碼
    public static String generateTaxiId() {
        return "T" + generateRandomLetters(2) + "-" + generateRandomNumbers(3);
    }

    // 隨機生成一個電動車的車牌號碼
    public static String generateElectricCarId() {
        return "E" + generateRandomLetters(2) + "-" + generateRandomNumbers(4);
    }

    // 檢查車牌號碼是否有效
    public static boolean isValidCarId(String carId) {
        return carId.matches("C[A-Z]{2}-\\d{4}");
    }

    // 檢查計程車的車牌號碼是否有效
    public static boolean isValidTaxiId(String carId) {
        return isValidCarId(carId);
    }

    // 檢查電動車的車牌號碼是否有效
    public static boolean isValidElectricCarId(String carId) {
        return carId.matches("E[A-Z]{2}-\\d{4}");
    }

    // 隨機生成一個字母
    private static String generateRandomLetters(int count) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            char letter = letters.charAt(random.nextInt(letters.length()));
            sb.append(letter);
        }
        return sb.toString();
    }

    // 隨機生成一個數字
    private static String generateRandomNumbers(int count) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int number = random.nextInt(10);
            sb.append(number);
        }
        return sb.toString();
    }
}
