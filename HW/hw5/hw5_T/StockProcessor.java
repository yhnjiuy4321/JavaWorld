import java.io.*;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class StockProcessor {

  private static final String HEADER = "\"證券代號\",\"證券名稱\",\"成交股數\",\"成交金額\",\"開盤價\",\"最高價\",\"最低價\",\"收盤價\",\"漲跌價差\",\"成交筆數\",\"漲跌幅\"";

  public List<String> process(String fileName) {

    List<Stock> stocksOfTypeA = new ArrayList<>();
    List<Stock> stocksOfTypeB = new ArrayList<>();
    List<Stock> top20StocksOfTypeA = new ArrayList<>();
    List<Stock> bottom20StocksOfTypeA = new ArrayList<>();
    List<Stock> top20StocksOfTypeB = new ArrayList<>();
    List<Stock> bottom20StocksOfTypeB = new ArrayList<>();


    try (LineNumberReader lnr = new LineNumberReader(new FileReader(fileName))) {
      String line = "";
      int count = 0;
      while ((line = lnr.readLine()) != null ) {
        count++;
        if (count == 1) {
          continue;
        }
        //System.out.println(line);
        String[] split = line.split(",");
        String id = parseString(split[0]);
        String name = parseString(split[1]);
        int tradingVolume = parseInt(split[2]);
        double turnover = parseDouble(split[3]);
        double openingPrice = parseDouble(split[4]);
        double highestPrice = parseDouble(split[5]);
        double lowestPrice = parseDouble(split[6]);
        double closingPrice = parseDouble(split[7]);
        double spread = parseDouble(split[8]);
        int numberOfTransactions = parseInt(split[9]);
        Stock stock = new Stock(id, name, tradingVolume, turnover, openingPrice, highestPrice,
            lowestPrice, closingPrice, spread, numberOfTransactions);
        if (id.length() == 4) {
          stocksOfTypeA.add(stock);
        } else if (id.startsWith("00") || id.startsWith("01") || id.startsWith("02")) {
          stocksOfTypeB.add(stock);
        }
      }

      Collections.sort(stocksOfTypeA);
      for(int i=0 ; i<20 ; i++) {
        bottom20StocksOfTypeA.add(stocksOfTypeA.get(i));
      }
      writeToFile("type_a_bottom_20.csv", bottom20StocksOfTypeA);

      Collections.reverse(stocksOfTypeA);
      for(int i=0 ; i<20 ; i++) {
        top20StocksOfTypeA.add(stocksOfTypeA.get(i));
      }
      writeToFile("type_a_top_20.csv", top20StocksOfTypeA);

      Collections.sort(stocksOfTypeB);
      for(int i = 0; i < 5; i++) {
        bottom20StocksOfTypeB.add(stocksOfTypeB.get(i));
      }
      writeToFile("type_b_bottom_5.csv", bottom20StocksOfTypeB);

      Collections.reverse(stocksOfTypeB);
      for (int i = 0; i < 5; i++) {
        top20StocksOfTypeB.add(stocksOfTypeB.get(i));
      }
      writeToFile("type_b_top_5.csv", top20StocksOfTypeB);

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return new ArrayList<>();
  }

  private void writeToFile(String fileName, List<Stock> stocks) {
    try (FileWriter fileWriter = new FileWriter(fileName);) {
      fileWriter.write(HEADER);
      fileWriter.write("\n");
      for(Stock stock: stocks) {
        fileWriter.write(generateOutputString(stock));
        fileWriter.write("\n");
      }
      fileWriter.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private String generateOutputString(Stock stock) {
    String record = "\"" + stock.getId() + "\",\"" +
        stock.getName() + "\",\"" +
        stock.getTradingVolume() + "\",\"" +
        stock.getTurnover() + "\",\"" +
        stock.getOpeningPrice() + "\",\"" +
        stock.getHighestPrice() + "\",\"" +
        stock.getLowestPrice() + "\",\"" +
        stock.getClosingPrice() + "\",\"" +
        stock.getSpread() + "\",\"" +
        stock.getNumberOfTransactions() + "\",\"" +
        String.format("%5.2f", stock.getPriceChange()) + "\"";
    return record;
  }

  private double parseDouble(String data) {
    if(data.length() == 2) {
      return 0.0;
    } else {
      return Double.parseDouble(data.substring(1, data.length()-1));
    }
  }

  private int parseInt(String data) {
    if(data.length() == 2) {
      return 0;
    } else {
      return Integer.parseInt(data.substring(1, data.length()-1));
    }
  }

  private String parseString(String data) {
    if(data.length() == 2) {
      return "";
    } else {
      return data.substring(1, data.length()-1);
    }
  }

}
