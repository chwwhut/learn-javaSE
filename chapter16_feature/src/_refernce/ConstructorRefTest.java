package _refernce;

import _refernce.data.Employee;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefTest {
    //构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        //1.
        Supplier<Employee> sup1 = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        System.out.println(sup1.get());

        //2.构造器引用
        Supplier<Employee> sup2 = Employee::new;//调用的是Employee类中空参的构造器
        System.out.println(sup2.get());
    }
    //Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> fun1 = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer id) {
                return new Employee(id);
            }
        };
        System.out.println(fun1.apply(12));

        //2.构造器引用
        Function<Integer,Employee> fun2 = Employee::new; //调用的是Employee类中参数是Integer/int类型的构造器
        System.out.println(fun2.apply(11));
    }

    //BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        //1.
        BiFunction<Integer,String,Employee> function1 = new BiFunction<Integer, String, Employee>() {
            @Override
            public Employee apply(Integer integer, String s) {
                return new Employee(integer,s);
            }
        };

        //2.
        BiFunction<Integer,String,Employee> function = Employee::new;
        System.out.println(function.apply(12,"Tony"));
    }
    //数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        //1.
        Function<Integer,Employee[]> fun1 = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer length) {
                return new Employee[length];
            }
        };
        System.out.println(fun1.apply(10).length);

        //2.
        Function<Integer,Employee[]> fun2 = Employee[]::new;
        System.out.println(fun2.apply(20).length);
    }
}
