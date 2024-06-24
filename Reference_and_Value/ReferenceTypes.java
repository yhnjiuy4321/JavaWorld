
public class ReferenceTypes {
    public static void main(String[] args) {

        int a =5;
        int b= a;
        System.out.println(a+","+b);
        b+=2;
        System.out.println(a+","+b);


        aStudent aaa=new aStudent();
        aaa.age=18;
        aStudent bbb=aaa;
        System.out.println(aaa == bbb);//回傳true

        aStudent ccc=new aStudent();//新陣列名為ccc
        ccc.age=18;
        System.out.println(aaa == ccc);//回傳false
        System.out.println(aaa == bbb);//回傳true
        System.out.println(bbb == ccc);//回傳false
        //不同陣列，就算相同數值，也會不相同

        }
    }
