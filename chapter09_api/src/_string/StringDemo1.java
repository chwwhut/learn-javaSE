package _string;

import org.junit.Test;

public class StringDemo1 {
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s3==s4);//fasle

        System.out.println(s1.equals(s2));//true
    }

    /*
     * String s = new String("hello");的内存解析？ 或：
     *
     * String s = new String("hello");在内存中创建了几个对象？
     *
     * */

    @Test
    public void test2(){
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Tom";
        p2.name = "Tom";

        p1.name = "Jerry";

        System.out.println(p2.name);//Tom
    }

    /*
     * 测试String的连接符：+
     * 情况1：常量 + 常量: 结果仍然存储在字符串常量池中，返回此字面量的地址。注：此时的常量可能是字面量，也可能是final修饰的常量
       情况2：常量 + 变量  或  变量 + 变量 ：都会通过new的方式创建一个新的字符串，返回堆空间中此字符串对象的地址
       情况3：调用字符串的intern():返回的是字符串常量池中字面量的地址
     * */
    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello"+"world";
        String s5 = s1+"world";
        String s6 = "hello"+s2;
        String s7 = s1+s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println();

        String s8 = s5.intern();  //intern():返回的是字符串常量池中字面量的地址
        System.out.println(s3 == s8);//true
    }

    @Test
    public void test4(){
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true
        System.out.println(s3 == s7);//true
    }

    @Test
    public void test5(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false
    }


}
class Person {
    String name;
}
