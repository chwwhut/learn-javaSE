package _refernce;

import _refernce.data.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest {
    // 情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test1(){
        //1.
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con1.accept("hello");

        //2.lambda表达式
        Consumer<String> con2 = s-> System.out.println(s);

        //3.方法引用
        PrintStream ps = System.out;
        Consumer<String> con3 = ps :: println; //情况一：对象 :: 实例方法
        con3.accept("hello");
    }
    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2(){
        Employee emp = new Employee(1001,"马虎疼",34,6000.38);

        //1.
        Supplier<String> sup1 = new Supplier<String>() {
            @Override
            public String get() {
                return emp.getName();
            }
        };
        System.out.println(sup1.get());

        //2.lambda表达式
        Supplier<String> sup2 = ()->emp.getName();
        System.out.println(sup2.get());

        //3.方法引用
        Supplier<String> sup3 = emp::getName;
    }

    // 情况二：类 :: 静态方法
    //Comparator中的int compare(T t1,T t2)
    //Integer中的int compare(T t1,T t2)
    @Test
    public void test3(){
        //1
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        //2.
        Comparator<Integer> com2 = (o1,o2)->Integer.compare(o1,o2);
        System.out.println(com2.compare(12,21));

        //3.
        Comparator<Integer> com3 = Integer::compare;
        System.out.println(com3.compare(23,32));
    }
    //Function中的R apply(T t)
    //Math中的Long round(Double d)
    @Test
    public void test4(){
        //1.
        Function<Double,Long> fun1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        //2.
        Function<Double,Long> fun2 = aDouble -> Math.round(aDouble);

        //3.
        Function<Double,Long> fun3 = Math::round;
    }

    // 情况三：类 :: 实例方法 (难)
    // Comparator中的int comapre(T t1,T t2)
    // String中的int t1.compareTo(t2)
    @Test
    public void test5(){
        //1.
        Comparator<String> con1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        System.out.println(con1.compare("abc","abd"));

        //2.
        Comparator<String> con2 = (s1,s2)->s1.compareTo(s2);
        System.out.println(con2.compare("abb","abc"));

        //3.
        Comparator<String> con3 = String::compareTo;
    }
    //BiPredicate中的boolean test(T t1, T t2);
    //String中的boolean t1.equals(t2)
    @Test
    public void test6(){
        //1.
        BiPredicate<String,String> biPre1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };

        //2.
        BiPredicate<String,String> biPredicate = (s1,s2)->s1.equals(s2);

        //3.
        BiPredicate<String,String> biPredicate1 = String::equals;
    }

    // Function中的R apply(T t)
    // Employee中的String getName();
    @Test
    public void test7(){
        Employee emp = new Employee(1001, "马化腾", 34, 6000.38);
        //1.
        Function<Employee,String> fun1 = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName();
            }
        };
        System.out.println(fun1.apply(emp));

        //2,
        Function<Employee,String> fun2 = employee -> employee.getName();

        //3.
        Function<Employee,String> fun3 = Employee::getName;
        System.out.println(fun3.apply(emp));
    }
}
