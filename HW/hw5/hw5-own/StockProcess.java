import java.io.*;
import java.util.*;

public class StockProcess {

    private static final String HEADER = "證券代號,證券名稱,成交股數,成交金額,開盤價,最高價,最低價,收盤價,漲跌價差,成交筆數,漲跌幅";
    public  List<String> process(String filename) throws IOException {

        List<Stock> stocksOfTypeA = new ArrayList<>();
        List<Stock> stocksOfTypeB = new ArrayList<>();
        List<Stock> top20StocksOfTypeA = new ArrayList<>();
        List<Stock> bottom20StocksOfTypeA = new ArrayList<>();
        List<Stock> top20StocksOfTypeB = new ArrayList<>();
        List<Stock> bottom20StocksOfTypeB = new ArrayList<>();

        List<Stock> fnList = new ArrayList<>();
        List<Stock> etfList = new ArrayList<>();

        //Map<String, Stock> fn = new TreeMap<>();
        //Map<String, Stock> etf = new TreeMap<>();

        BufferedReader fbr = new BufferedReader(new FileReader(filename));
        fbr.readLine();
        String line = "";

        try {
            while ((line = fbr.readLine()) != null) {
                String[] lineSpite = line.split(",");

                for (int i = 0; i < lineSpite.length; i++) {
                    if (lineSpite[i].equals("\"\"")) {
                        lineSpite[i] = "0";
                    }
                    lineSpite[i] = lineSpite[i].replace("\"", "");
                }

                if ((lineSpite[0].matches("0[0-2][0-9A-Z]{2,4}"))) {

                    Stock etf1 = new Stock(lineSpite[0], lineSpite[1], lineSpite[2], lineSpite[3], lineSpite[4], lineSpite[5], lineSpite[6], Double.parseDouble(lineSpite[7].replace("\"", "")), Double.parseDouble(lineSpite[8].replace("\"", "")), lineSpite[9]);
                    //etf.put(lineSpite[0], etf1);
                    etfList.add(etf1);

                    /*
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter("type_b.csv"));
                    bw2.write(HEADER);
                    bw2.newLine();
                    for (Map.Entry<String,Etf > entry2 : etf.entrySet()) {//

                        double Amplitude =  (entry2.getValue().getPriceChange())*100/ (entry2.getValue().getClosePrice()-entry2.getValue().getPriceChange()) ;
                        String formattedAmplitude = String.format("%.2f", Amplitude);

                        //String Amplitude =  lineSpite[0] +(entry2.getValue().getPriceChange())*100/ (entry2.getValue().getClosePrice()-entry2.getValue().getPriceChange()) ;

                        bw2.write(entry2.getValue().getId()+","+entry2.getValue().getName()+","+entry2.getValue().getNum()+","+entry2.getValue().getAmount()+","+entry2.getValue().getOpenPrice()+","+entry2.getValue().getHighPrice()+","+entry2.getValue().getLowPrice()+","+entry2.getValue().getClosePrice()+","+entry2.getValue().getPriceChange()+","+entry2.getValue().getTransactionCount()+","+formattedAmplitude);
                        bw2.newLine();
                    }
                    bw2.flush();
                    bw2.close();
*/
                } else {
                    Stock fourNum = new Stock(lineSpite[0], lineSpite[1], lineSpite[2], lineSpite[3], lineSpite[4], lineSpite[5], lineSpite[6], Double.parseDouble(lineSpite[7].replace("\"", "")), Double.parseDouble(lineSpite[8].replace("\"", "")), lineSpite[9]);
                    //fn.put(lineSpite[0], fourNum);
                    fnList.add(fourNum);

                    /*
                    BufferedWriter bw1 = new BufferedWriter(new FileWriter("type_a.csv"));
                    bw1.write(HEADER);
                    bw1.newLine();
                    for (Map.Entry<String,FourNum > entry1 : fn.entrySet()) {

                        double Amplitude =  (entry1.getValue().getPriceChange())*100/ (entry1.getValue().getClosePrice()-entry1.getValue().getPriceChange()) ;
                        String formattedAmplitude = String.format("%.2f", Amplitude);


                        //Collections.sort(list,Collections.reverseOrder());//排序，預設為升冪，若要降冪，則要加入Collections.reverse(list);
                        //Collections.reverseOrder(list);


                        bw1.write(entry1.getValue().getId()+","+entry1.getValue().getName()+","+entry1.getValue().getNum()+","+entry1.getValue().getAmount()+","+entry1.getValue().getOpenPrice()+","+entry1.getValue().getHighPrice()+","+entry1.getValue().getLowPrice()+","+entry1.getValue().getClosePrice()+","+entry1.getValue().getPriceChange()+","+entry1.getValue().getTransactionCount()+","+formattedAmplitude);
                        bw1.newLine();
                       //bw1.write(list.get(0)+","+list.get(1)+","+list.get(2)+","+list.get(3)+","+list.get(4)+","+list.get(5)+","+list.get(6)+","+list.get(7)+","+list.get(8)+","+list.get(9)+","+list.get(10));
                    }
                    bw1.flush();
                    bw1.close();
                     */
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //股價振幅 = (漲跌價差) * 100 / (收盤價 - 漲跌價差)
        for (Stock stock : fnList) {
            double Amplitude = (stock.getPriceChange()) * 100 / (stock.getClosePrice() - stock.getPriceChange());
            stock.setAmplitude(Amplitude);
        }

        for (Stock stock : etfList) {
            double Amplitude = (stock.getPriceChange()) * 100 / (stock.getClosePrice() - stock.getPriceChange());

            stock.setAmplitude(Amplitude);
        }

        //將list依照股價幅度排序，並取出前20名
        Collections.sort(fnList, new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                return Double.compare(o1.getAmplitude(), o2.getAmplitude());
            }
        });

        Collections.sort(etfList, new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                return Double.compare(o1.getAmplitude(), o2.getAmplitude());//小到大，若要大到小，則要加入Collections.reverse(list);
            }
        });




        //取出前20名
        for(int i=fnList.size()-20 ; i<fnList.size() ; i++) {
            top20StocksOfTypeA.add(fnList.get(i));
        }

        for(int i=0 ; i<20 ; i++) {
            bottom20StocksOfTypeA.add(fnList.get(i));
        }

        for(int i=etfList.size()-20 ; i<etfList.size() ; i++) {
            top20StocksOfTypeB.add(etfList.get(i));
        }

        for(int i=0 ; i<20 ; i++) {
            bottom20StocksOfTypeB.add(etfList.get(i));
        }

        //將排序倒轉，變成大到小
        Collections.reverse(top20StocksOfTypeA);
        Collections.reverse(top20StocksOfTypeB);

        //將資料寫入檔案
        writeToFile("type_a_top_20.csv", top20StocksOfTypeA);
        writeToFile("type_a_bottom_20.csv", bottom20StocksOfTypeA);
        writeToFile("type_b_top_20.csv", top20StocksOfTypeB);
        writeToFile("type_b_bottom_20.csv", bottom20StocksOfTypeB);

        return List.of();
    }

    //以下是將資料寫入檔案的方法
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

    //以下是將Stock物件轉換成字串的方法
    private String generateOutputString(Stock stock) {
        String record =stock.getId() + "," +
                stock.getName() + "," +
                stock.getNum() + "," +
                stock.getAmount() + "," +
                stock.getOpenPrice() + "," +
                stock.getHighPrice() + "," +
                stock.getLowPrice() + "," +
                stock.getClosePrice() + "," +
                stock.getPriceChange() + "," +
                stock.getTransactionCount() + "," +
                String.format("%5.2f", stock.getAmplitude());

        return record;
    }
}