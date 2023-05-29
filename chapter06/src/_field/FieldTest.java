package _field;

public class FieldTest {

    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);
    }
}

class Order{
    {
        orderId = 2;
    }

    int orderId = 1;


    public Order(){
        super();
        //orderId = 3;
    }
    public Order(int orderId){
        this.orderId = orderId;
    }
    public void eat(){
        sleep();
    }
    public void sleep(){}
}