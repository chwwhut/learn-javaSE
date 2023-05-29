package _singleton;
//懒汉式
public class Singleton_1 {
    // 1.私有化构造器
    private Singleton_1() {
    }
    // 2.内部提供一个当前类的实例
    // 4.此实例也必须静态化
    private static Singleton_1 single;//声明

    // 3.提供公共的静态的方法，返回当前类的对象
    public static Singleton_1 getInstance() {
        if(single == null) {
            single = new Singleton_1();
        }
        return single;
    }
}
