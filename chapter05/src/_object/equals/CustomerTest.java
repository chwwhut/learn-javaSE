package _object.equals;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom",12,new Account(2000));
        Customer c2 = new Customer("Tom",12,new Account(2000));

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);//true
        System.out.println(str1.equals(str2));//true



    }
}
