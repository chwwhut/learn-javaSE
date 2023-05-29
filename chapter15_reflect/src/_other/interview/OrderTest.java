package _other.interview;

import org.junit.Test;

/**
 2. Class.forName("全路径") 会调用哪些方法 ？ 会调用构造方法吗？加载的类会放在哪？
     Class.forName() 会执行执行类构造器<clinit>()方法。
     不会调用构造方法
     加载的类放在方法区。
 */
public class OrderTest {
    @Test
    public void test1() throws ClassNotFoundException {
        String className = "_other.interview.Order";
        Class.forName(className);
//        Class.forName(className);
    }

    @Test
    public void test2() throws ClassNotFoundException {
        String className = "_other.interview.Order";
        ClassLoader.getSystemClassLoader().loadClass(className);
    }
}
