package _set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set.contains(new Person("Tom",12)));

    }

    @Test
    public void test2(){ //可以按照添加元素的顺序实现遍历。便于频繁的查询操作。
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add("AA");
        set.add(new Person("Tom",12));
        set.add(123);
        set.add("BB");

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
