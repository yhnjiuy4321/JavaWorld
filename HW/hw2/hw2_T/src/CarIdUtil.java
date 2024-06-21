public class CarIdUtil {
  public static String generateCarId() {
    StringBuilder builder = new StringBuilder();
    builder.append("C");
    builder.append(generateLetters(2));
    builder.append("-");
    builder.append(generateNumbers(4));
    String carId = builder.toString();
    return carId;
  }

  public static String generateTaxiId() {
    StringBuilder builder = new StringBuilder();
    builder.append("T");
    builder.append(generateLetters(2));
    builder.append("-");
    builder.append(generateNumbers(3));
    return builder.toString();
  }

  public static String generateElectricCarId() {
    StringBuilder builder = new StringBuilder();
    builder.append("E");
    builder.append(generateLetters(2));
    builder.append("-");
    builder.append(generateNumbers(4));
    return builder.toString();
  }

  public static boolean isValidCarId(String carId) {
    if(carId.matches("C[A-Z]{2}-\\d{4}")) {
      return true;
    }
    return false;
  }

  public static boolean isValidTaxiId(String carId) {
    if(carId.matches("T[A-Z]{2}-\\d{3}")) {
      return true;
    }
    return false;
  }

  public static boolean isValidElectricCarId(String carId) {
    if(carId.matches("E[A-Z]{2}-\\d{4}")) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(generateCarId());
  }

  public static String generateLetter() {
    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int index = (int)(Math.random()*26);
    String letter = String.valueOf(letters.charAt(index));
    return letter;
  }

  public static String generateNumber() {
    int num = (int)(Math.random()*10);
    String strNum = String.valueOf(num);
    return strNum;
  }

  public static String generateLetters(int length) {
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < length ;i++) {
      builder.append(generateLetter());
    }
    return builder.toString();
  }

  public static String generateNumbers(int length) {
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < length ;i++) {
      builder.append(generateNumber());
    }
    return builder.toString();
  }
}
