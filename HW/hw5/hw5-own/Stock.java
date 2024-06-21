public class Stock {
    private String id;
    private String name;
    private String num;
    private String amount;
    private String openPrice;
    private String highPrice;
    private String lowPrice;
    private double closePrice;
    private double priceChange;
    private String transactionCount;
    private double Amplitude;


    public Stock(String id, String name, String num, String amount, String openPrice, String highPrice, String lowPrice, double closePrice, double priceChange, String transactionCount) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.amount = amount;
        this.openPrice = openPrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.closePrice = closePrice;
        this.priceChange = priceChange;
        this.transactionCount = transactionCount;


    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getAmount() {
        return amount;
    }

    public String getOpenPrice() {
        return openPrice;
    }

    public String getHighPrice() {
        return highPrice;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public double getPriceChange() {
        return priceChange;
    }

    public String getTransactionCount() {
        return transactionCount;
    }

    public void setAmplitude(double amplitude) {
        Amplitude = amplitude;
    }

    public double getAmplitude() {

        Amplitude =  (priceChange)*100/ (closePrice-priceChange) ;

        if(Double.isNaN(Amplitude)){
            Amplitude = 0;
        }

        return Amplitude;
    }

}
