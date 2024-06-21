import java.util.*;

public class Set_List {
    public static void main(String[] args) {

        //Set的性質:無序、不可重複，適合查詢、或讀取大量資料
        Set<String> name1 = new HashSet<>();//Set是介面，HashSet是實作方式，HashSet讀取特快，但不保證存放元素的順序。
        Set<String> name2 = new TreeSet<>();//TreeSet是實作方式，TreeSet可以對元素進行排序，但讀取速度較慢。
        Set<String> name3 = new LinkedHashSet<>();//LinkedHashSet保證裡面元素存放的順序與新增時相同。最適合拿來存放由資料庫中存取的資料集。

        //Set<String> ex = xxx.keySet();//keySet()是取得Map的key集合，換言之，就是取得所有的key

        //List的性質:有序、可重複，可用index存取資料，適合查詢、或讀取大量資料
        List<String> list1 = new ArrayList<>(); //ArrayList適合查詢、或讀取大量資料(有序號照順序)
        List<String> list2 = new LinkedList<>(); //LinkedList適合新增、刪除資料

        //以下是操作Set的方法
        System.out.println("=== Set ===");
        name1.add("aaa");
        name1.add("bbb");
        name1.add("ccc");
        name1.add("ddd");
        name1.add("aaa");//重複的元素不會被加入，所以只name1.size()只會有4

        name2.add("AAA");
        name2.add("BBB");
        name2.add("CCC");
        name2.add("AAA");//重複的元素不會被加入，所以只name2.size()只會有3

        name3.add("111");
        name3.add("222");
        name3.add("333");
        name3.add("111");//重複的元素不會被加入，所以只name3.size()只會有3

        //可更改name1、name2、name3，查看size的變化
        System.out.println(name3.size());
        for (String name : name3) {
            System.out.println(name);
        }

        System.out.println(name3.contains("123"));//判斷Set中是否有123


        //以下是操作List的方法
        System.out.println("=== List ===");
        list1.add("777");
        list1.add("888");
        list1.add("999");
        list1.add("999");//重複的元素會被加入，所以list1.size()會有4

        System.out.println(list1.size());
        for (String list : list1) {
            System.out.println(list);
        }


        list2.add("ㄅㄅㄅ");
        list2.add("ㄆㄆㄆ");
        list2.add("ㄇㄇㄇ");
        list2.add("ㄇㄇㄇ");

        System.out.println(list2.size());
        for (String list : list2) {
            System.out.println(list);
        }
    }
}

/*
Set的常用方法:
add()方法:將元素加入Set
size()方法:取得Set的大小
for迴圈:遍歷Set
remove()方法:移除Set中的元素
contains()方法:判斷Set中是否有某元素
clear()方法:清除Set中的元素
isEmpty()方法:判斷Set是否為空
boolean add(E e)方法:將元素加入Set，若元素已存在，則不加入
boolean remove(Object o)方法:移除Set中的元素，若元素不存在，則不移除
boolean contains(Object o)方法:判斷Set中是否有某元素
boolean isEmpty()方法:判斷Set是否為空

List的常用方法:
add()方法:將元素加入List
size()方法:取得List的大小
for迴圈:遍歷List
remove()方法:移除List中的元素
indexOf()方法:取得List中元素的索引
get()方法:取得List中的元素
set()方法:設定List中的元素
addAll()方法:將List中的元素加入另一個List
clear()方法:清除List中的元素
isEmpty()方法:判斷List是否為空

set與list的差異:
Set的性質:無序、不可重複，適合查詢、或讀取大量資料
List的性質:有序、可重複，可用index存取資料，適合查詢、或讀取大量資料

set、list與map的差異:
Set是以key的方式(即每個元素本身就是“key”)存取資料，List是以index的方式存取資料，Map是以key-value的方式存取資料

 */