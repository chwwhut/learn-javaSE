package _stringmore;

import org.junit.Test;

public class StringBufferBuilderTest {
    /*
    *   （1）StringBuffer append(xx)：提供了很多的append()方法，用于进行字符串追加的方式拼接
        （2）StringBuffer delete(int start, int end)：删除[start,end)之间字符
        （3）StringBuffer deleteCharAt(int index)：删除[index]位置字符
        （4）StringBuffer replace(int start, int end, String str)：替换[start,end)范围的字符序列为str
        （5）void setCharAt(int index, char c)：替换[index]位置字符
        （6）char charAt(int index)：查找指定index位置上的字符
        （7）StringBuffer insert(int index, xx)：在[index]位置插入xx
        （8）int length()：返回存储的字符数据的长度
        （9）StringBuffer reverse()：反转
    * */

    @Test
    public void test1(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("123").append("def");//方法链的调用
        System.out.println(stringBuilder);
    }

    @Test
    public void test2(){
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.insert(2,1);//he1llo
        stringBuilder.insert(2,"abc");//heabc1llo

        System.out.println(stringBuilder);

        StringBuilder stringBuilder1 = stringBuilder.reverse(); //return this
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);

        System.out.println(stringBuilder == stringBuilder1);//true

        System.out.println(stringBuilder.length());//实际存储的字符的个数


    }@Test
    public void test3(){
        StringBuilder  sBuilder = new StringBuilder("hello");
        sBuilder.setLength(2);

        System.out.println(sBuilder);//he

        sBuilder.append("c");
        System.out.println(sBuilder);//hec

        sBuilder.setLength(10);
        System.out.println(sBuilder);
        System.out.println(sBuilder.charAt(6)==0);//true
    }

    /*
     * 测试String、StringBuffer、StringBuilder在操作数据方面的效率
     * */

    @Test
    public void test4(){
        //初始设置
        long startTime = 0L;
        long endTime = 0L;


        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;//拼接操作
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));

    }
}
