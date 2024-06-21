class Test {
    // 定義方法 aaa，接受一個String陣列作參數
    void aaa(String[] strs) {
        // 使用增强型 for 循环遍歷字符陣列
        for (String s : strs) {
            // 打印每個字符串，注意大小寫正確，使用分號結尾
            System.out.print(s + " ");  // 在字符串後添加一个空格以便區分輸出的每個字符串
        }
        System.out.println(); // 在輸出完所有字符串後換行
    }

}

public class Anonymous_array {
    public static void main(String[] args) {
        // 建置 Test 類別的一個實例
        Test b = new Test();

        // 建置一個字符串陣列
        String[] strings = {"Hello", "World", "Java"};

        // 调用 aaa 方法並導入字符陣列
        b.aaa(strings);

        //使用匿名陣列
        b.aaa(new String[]{"iloveyou", "World", "Java"});
        //輸出的兩個陣列是獨立的
    }
}


