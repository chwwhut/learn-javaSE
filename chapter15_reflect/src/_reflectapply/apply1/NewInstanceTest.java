package _reflectapply.apply1;


import _reflectapply.data.Person;
import org.junit.Test;


public class NewInstanceTest {
    //反射的应用一：创建运行时类的对象
    /*
    1.2 要想创建对象成功，需要满足：
    条件1：要求运行时类中必须提供一个空参的构造器
    条件2：要求提供的空参的构造器的权限要足够。
     */
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        Person per =(Person) clazz.newInstance();

        System.out.println(per);
    }

}
