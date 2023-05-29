package _interface;

public interface USB3 {
    //静态常量
    long MAX_SPEED = 500*1024*1024;//省略 public static final

    //抽象方法
    void in();//省略public abstract
    void out();

    //默认方法

    default void start(){      //public可以省略
        System.out.println("开始");
    }

    default void stop(){
        System.out.println("结束");
    }

    //静态方法

    static void show(){         //public可以省略
        System.out.println("USB3.0 可以同步全速地进行读写操作");
    }
}
