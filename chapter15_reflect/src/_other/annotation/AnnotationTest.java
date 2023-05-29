package _other.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

public class AnnotationTest {
    @Test
    public void test1(){
        //获取类声明上的注解
        Class clazz = Customer.class;

        Table annotation = (Table) clazz.getDeclaredAnnotation(Table.class);

        System.out.println(annotation.value());

    }
    @Test
    public void test2() throws Exception {

        Class clazz = Customer.class;

        Field nameField = clazz.getDeclaredField("name");
        Field ageField = clazz.getDeclaredField("age");
        //获取属性声明上的注解
        Column nameColumn = nameField.getDeclaredAnnotation(Column.class);
        System.out.println(nameColumn.columnName());
        System.out.println(nameColumn.columnType());

        Column ageColumn = ageField.getDeclaredAnnotation(Column.class);
        System.out.println(ageColumn.columnName());
        System.out.println(ageColumn.columnType());
    }
}
