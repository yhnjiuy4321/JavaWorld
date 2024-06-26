import java.util.*;

public class MAP {
    public static void main(String[] args) {
        //Map是介面
        Map<String, String> student1 = new HashMap<>();//HashMap讀取特快，但不保證存放元素的順序。
        Map<String, String> student2 = new LinkedHashMap<>();//LinkedHashMap保證裡面元素存放的順序與新增時相同。最適合拿來存放由資料庫中存取的資料集。
        Map<String, String> student3 = new TreeMap<>();//TreeMap可以對元素進行排序，但讀取速度較慢。
        Map<String, String> student4 = new Hashtable<>();//Hashtable是舊的實作方式，不建議使用，因為效能較差
        //Map與List的差異，Map是以key-value的方式存取資料，List是以index的方式存取資料
        //<String, String>的意思是key為String，value為String


        /*
        Map<String,Student> students = new HashMap<>(); //前提是Student要先自訂類別，並且有建構子
        students.put("001",new Student("John",18));//001是key，new Student("John",18)是value

        //輸出方式參考下面while迴圈，記得修改為Student型態(Map.Entry<String,String>改為Map.Entry<String,Student>)

        while (iterator.hasNext()){ //iterator是迭代器，當有下一個元素時，執行迴圈，hasNext()是判斷是否有下一個元素
            Map.Entry<String,Student> entry = iterator.next();//next()是取得下一個元素
            System.out.println(entry.getKey()+":"+entry.getValue().getName());--->(.getValue()是因為Student)
        }
         */


        student3.put("001", "John");
        student3.put("002", "Mary");
        student3.put("003", "Tom");

        System.out.println(student3.isEmpty());//判斷Map是否為空

        System.out.println("總共"+student3.size()+"筆資料");

        System.out.println("編號001的值:"+student3.get("001"));
        System.out.println("編號002的值:"+student3.get("002"));
        System.out.println("==========");


        //依序輸出

        //~方法一~
        Set<String> ids = student3.keySet();
        //keySet()是取得Map的key集合，換言之，就是取得所有的key，所以ids是所有的key，也就是001、002、003
        for (String id : ids) {
            System.out.println(id + ":" + student3.get(id));
        }
        System.out.println("==========");


        //~方法二~
        Set<Map.Entry<String,String>> entries = student3.entrySet();
        //Set是不重複的集合，Map.Entry是key-value的集合，所以set包住Map.Entry的意義是不重複的key-value集合
        //若不用Entry，則只有key或value，但無法同時取得key、value，換言之，只用Map的話，只能取得key或value其中之一
        //entrySet();是取得Map的key-value集合


        //方法二-1
        Iterator <Map.Entry<String,String>> iterator = entries.iterator();//.iterator()是取得迭代器，換言之，是取得集合的元素
        while (iterator.hasNext()){   //假設有下一個元素，執行迴圈
            Map.Entry<String,String> entry = iterator.next();//取得下一個元素
            System.out.println(entry.getKey()+":"+entry.getValue());//取得key、value
        }

        System.out.println("==========");

        //方法二-2
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

/*
Iterator是一個介面，主要用來逐一瀏覽集合
方法有:
hasNext():判斷是否有下一個元素
next():取得下一個元素
remove():移除元素
hasNext():是判斷是否有下一個元素


Map的常用方法:
put(K key, V value)：將key、value存入Map
get(Object key)：取得key對應的value
keySet()：取得Map的key集合
entrySet()：取得Map的key-value集合
size()：取得Map的大小
remove(Object key)：移除Map中的元素
containsKey(Object key)：判斷Map中是否有某key
containsValue(Object value)：判斷Map中是否有某value
clear()：清除Map中的元素
isEmpty()：判斷Map是否為空

Map.Entry的常用方法:
getKey()：取得key
getValue()：取得value
setValue()：設定value
equals(Object o)：判斷是否相等
toString()：取得字串表示

 */