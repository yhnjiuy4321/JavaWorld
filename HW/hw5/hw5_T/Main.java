import java.io.File;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    File f = new File("STOCK_DAY_ALL_20240613.csv");
    StockProcessor sp = new StockProcessor();
    List<String> fileNames = sp.process(f.getName());

  }
}