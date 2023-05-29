package _lambda.function;

import org.junit.Test;

public class MyFunctionalInterfaceTest {
    @Test
    public void test1(){
        MyFunctionalInterface m = ()-> System.out.println("hello");

        m.method();
    }
}
