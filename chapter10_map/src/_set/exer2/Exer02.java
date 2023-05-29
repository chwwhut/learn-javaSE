package _set.exer2;

import java.util.HashSet;
import java.util.Iterator;

// 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
public class Exer02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        while(hashSet.size()<10){
            int num = (int) (Math.random()*(20-1+1)+1);
            hashSet.add(num);
        }


        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
