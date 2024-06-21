//String物件產生後，內容就無法改變，連接運算或使用String類別中的方法，都屬於新的字串。
//如果要能改變字串內容的物件，就需要使用StringBuffer或StringBuilder
//StringBuffer與StringBuilder的使用上並無差異，主要是差在效能消耗與線程安全性


public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        StringBuffer words = new StringBuffer("hello");
        for (int i = 0; i < 10; i++) {
            words.append("!");//+字
            System.out.println(words);
        }


        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(5, "Beautiful ");
        //插入字串，offset為第幾位
        //依例子來說，"Beautiful "要插入第5跟第6之間，故「world 」會直接被向後推(字串首位為0)
        System.out.println(sb);

        StringBuffer tt = new StringBuffer("ThisIsATest");
        System.out.println(tt.replace(7,tt.length(),"Book"));//取代從start到end-1索引碼之間的字元
        System.out.println(tt.delete(1,4));//刪除字元，從第1到第4(不包含4)

        StringBuffer aa= new StringBuffer("ABCDE");
        System.out.println(aa.reverse());//倒轉字串
        System.out.println(aa.reverse());//再反轉則會回到原本樣子(StringBuffer會改變字串內容)
        System.out.println(aa.deleteCharAt(2));//刪除指定字元
        aa.setCharAt(0,'R');//改變指定字元
        System.out.println(aa);
        System.out.println(aa.reverse());

        StringBuilder yy= new StringBuilder("12345");
        System.out.println(yy.reverse());

    }
}
