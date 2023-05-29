package _example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    /*
     * 使用反射之前可以执行的操作
     * */
    @Test
    public void test1(){
        //1.创建Person类的实例
//        public Person()
        Person p1 = new Person();
        System.out.println(p1);

        //2.调用属性
        //public int age;
        p1.age = 10;
        System.out.println(p1.age);

        //3.调用方法
        //public void show()
        p1.show();
    }
    /*
     * 使用反射完成上述的操作
     * */
    @Test
    public void test2() throws Exception {
        //1.创建Person类的实例
//        public Person()
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        System.out.println(p1);

        //2.调用属性
        //public int age;
        Field ageField = clazz.getField("age");
        ageField.set(p1,10);
        System.out.println(ageField.get(p1));

        //3.调用方法
        //public void show()
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);
    }
    @Test
    public void test3() throws Exception {
        //1. 调用私有的构造器，创建Person的实例
        //private Person(String name, int age)
        Class<Person> clazz = Person.class;
        Constructor<Person> cons = clazz.getDeclaredConstructor(String.class, int.class);
        cons.setAccessible(true);
        Person p1 = cons.newInstance("Tom", 12);
        System.out.println(p1);

        //2. 调用私有的属性
        //private String name;
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"Jerry");
        System.out.println(nameField.get(p1));

        //3. 调用私有的方法
        //private String showNation(String nation)
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String info =(String) showNation.invoke(p1, "CHN");
        System.out.println(info);
    }
}
