public class Stock implements Comparable<Stock> {
  private String id;
  private String name;
  private int tradingVolume;
  private double turnover;
  private double openingPrice;
  private double highestPrice;
  private double lowestPrice;
  private double closingPrice;
  private double spread;
  private int numberOfTransactions;
  private double priceChange;

  public Stock(String id, String name, int tradingVolume, double turnover, double openingPrice, double highestPrice, double lowestPrice, double closingPrice, double spread, int numberOfTransactions) {
    this.id = id;
    this.name = name;
    this.tradingVolume = tradingVolume;
    this.turnover = turnover;
    this.openingPrice = openingPrice;
    this.highestPrice = highestPrice;
    this.lowestPrice = lowestPrice;
    this.closingPrice = closingPrice;
    this.spread = spread;
    this.numberOfTransactions = numberOfTransactions;

    double preClosingPrice = closingPrice - spread;
    priceChange = preClosingPrice == 0 ? 0 : (closingPrice - preClosingPrice) * 100 / preClosingPrice;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getTradingVolume() {
    return tradingVolume;
  }

  public double getTurnover() {
    return turnover;
  }

  public double getOpeningPrice() {
    return openingPrice;
  }

  public double getHighestPrice() {
    return highestPrice;
  }

  public double getLowestPrice() {
    return lowestPrice;
  }

  public double getClosingPrice() {
    return closingPrice;
  }

  public double getSpread() {
    return spread;
  }

  public int getNumberOfTransactions() {
    return numberOfTransactions;
  }

  public double getPriceChange() {
    return priceChange;
  }

  @Override
  public String toString() {
    return "Stock{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", tradingVolume=" + tradingVolume +
        ", turnover=" + turnover +
        ", openingPrice=" + openingPrice +
        ", highestPrice=" + highestPrice +
        ", lowestPrice=" + lowestPrice +
        ", closingPrice=" + closingPrice +
        ", spread=" + spread +
        ", numberOfTransactions=" + numberOfTransactions +
        ", priceChange=" + priceChange +
        '}';
  }

  @Override
  public int compareTo(Stock stock) {
    if (this.priceChange > stock.priceChange) {
      return 1;
    } else if (this.priceChange < stock.priceChange) {
      return -1;
    } else {
      return 0;
    }
  }
}
