package _enum.exer;

public class BankTest {
    public static void main(String[] args) {
        System.out.println(GirlFriend.XIAO_LI);
    }
}

//jdk5.0之前使用枚举类定义单例模式

class Bank1{
    private Bank1(){}

    public static final Bank1 Instance = new Bank1();
}

//jdk5.0之后
enum Bank2{
    CPB;
}

enum GirlFriend{
    XIAO_LI(20);

    private final int age;

    private GirlFriend(int age){
        this.age = age;
    }
}