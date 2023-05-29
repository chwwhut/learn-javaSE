package _class;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {
    /*
     * 在jdk8中执行如下的代码：
     * */
    @Test
    public void test1(){
        //jdk17
        //获取系统类加载器
        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader1);//jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b

        //获取扩展类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);//jdk.internal.loader.ClassLoaders$PlatformClassLoader@256216b3

        //获取引导类加载器:失败  > 使用C/C++语言编写的，不能通过Java代码获取其实例
        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3);//null
    }
    @Test
    public void test2() throws ClassNotFoundException {
        //用户自定义的类使用的是系统类加载器加载的。
        Class clazz1 = User.class;
        ClassLoader classLoader = clazz1.getClassLoader();
        System.out.println(classLoader);

        //对于Java的核心api使用引导类加载器加载
        Class clazz2 = Class.forName("java.lang.String");
        ClassLoader classLoader1 = clazz2.getClassLoader();
        System.out.println(classLoader1);//null
    }
    /*
     * 需求：通过ClassLoader加载指定的配置文件
     * */
    @Test
    public void test3() throws IOException {
        Properties pros = new Properties();

        //通过类的加载器读取的文件的默认的路径为：当前module下的src下
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info1.properties");
        pros.load(is);

        String name = pros.getProperty("name");
        String pwd = pros.getProperty("password");
        System.out.println(name + ":"+pwd);
    }
    //Properties:处理属性文件
    @Test
    public void test4() throws IOException {
        Properties pros = new Properties();

        //读取的文件的默认路径为：当前的module
        FileInputStream is = new FileInputStream("info.properties");
//        FileInputStream is = new FileInputStream(new File("src/info1.properties"));

        pros.load(is);

        String name = pros.getProperty("name");
        String pwd = pros.getProperty("password");
        System.out.println(name+ ":"+pwd);


    }
}
