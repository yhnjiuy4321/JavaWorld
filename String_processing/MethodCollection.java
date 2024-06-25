public class MethodCollection {
    public static void main(String[] args) {

        String word1="abc";
        String word2="def";
        System.out.println(word1.compareTo(word2));
        //比較字串的大小，大小依據字元的Unicode值，若第一個字元相同，則比較第二個字元，以此類推

        String word3="ab";
        String word4="ab";
        System.out.println(word3.compareTo(word4));//兩值一樣，輸出為0

        String word5="Ab";
        String word6="ab";
        System.out.println(word5.compareToIgnoreCase(word6));//compareToIgnoreCase:忽略大小寫


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");


        String text="i study in fcu";
        String text2=" Example ";
        System.out.println(text.contains("kkk"));//text是否包含"kkk"
        System.out.println(text.endsWith("u"));//text的結尾是否為u
        System.out.println(text.indexOf("i"));//"i"是從前面數來第幾個字元
        System.out.println(text.lastIndexOf("i"));//從後面數來，i是第幾個字元
        System.out.println(text.lastIndexOf("i",9));//從第九個字元數來(從尾巴數來)，i是第幾個字元
        System.out.println(text.indexOf("AAA"));//無此字串，顯示-1
        System.out.println(text.substring(4,5));//第五個字串不算入，等同只擷取編號4字元
        System.out.println(text.substring(0,4));//第四個字串不算入
        System.out.println(text.substring(4,text.length()-1));//「長度-1」剛好是最後一個字元
        System.out.println(text2.trim());//刪除字串兩端的空白字符
        System.out.println(text2.toLowerCase());//全部變小寫
        System.out.println(text2.toUpperCase());//全部變大寫
        System.out.println(text2.repeat(2));//重複2次
        System.out.println(text2.isBlank());//判斷是否empty
        String text3=" Example ";
        System.out.println(text3.isEmpty());//只要length不為0 就一定是false
        System.out.println(text3.isBlank());
        System.out.println(text3.equals(text2));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        String a ="逢甲大學";
        char[] chars=new char[4];
        a.getChars(1,4,chars,0);
        System.out.println(new String(chars));
        //將字符串的一部分複製到一個字符數組中
        //srcBegin：要複製的字符串部分的起始索引（包含）
        //srcEnd：要複製的字符串部分的結束索引（不包含）
        //dst：目標字符數組，將從字符串中複製的字符存放到這個數組中
        //dstBegin：字符數組中開始存放字符的起始索引(從chars的第幾個位置開始放起)
    }
}