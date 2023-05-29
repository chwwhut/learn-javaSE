public class StringTest {
    public static void main(String[] args){
        int no = 10;
        String str = "abcdef";
        String str1 = str +"xyz" + no;

        str1 = str1 + "123";
        char c = '国';

        double pi = 3.1416;
        str1 = str1 + pi;
        boolean b = false;
        str1 = str1 + b;
        str1 = str1 + c;

        System.out.println("str1=" + str1);

        // 通常，字符串不能直接转换为基本类型，但通过基本类型对应的包装类则可以实现把字符串转换成基本类型
        // String a = “43”; int i = Integer.parseInt(a);
    }
}
