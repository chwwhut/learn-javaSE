package _singleton;
//饿汉式
public class Singleton {
    //1.私有化构造器
    private Singleton(){
    }

    //2.内部提供一个当前类的实例
    //4.此实例也必须静态化
    private static Singleton singleton = new Singleton();

    //3.提供公共的静态的方法，返回当前的对象
    public static Singleton getInstance(){
        return singleton;
    }
}
