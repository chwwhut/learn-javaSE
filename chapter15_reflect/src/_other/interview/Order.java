package _other.interview;


public class Order {
    static int orderDesc = 1;

    static{
        orderDesc = 2;
        System.out.println("Order static block...");
    }
}
