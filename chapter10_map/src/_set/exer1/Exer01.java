package _set.exer1;

import java.util.*;

public class Exer01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(22);
        list.add(22);
        list.add(22);
        list.add(45);
        list.add(45);
        list.add(45);

        List newList = duplicateList(list);
        System.out.println(newList);
    }

    public static List duplicateList(List list){
        //方式1
//        Set set = new HashSet(list);
//        ArrayList list1 = new ArrayList(set);
//        return list1;

        //方式2
        HashSet set = new HashSet();
        for (Object obj: list){
            set.add(obj);
        }

        List list1 = new ArrayList();
        for(Object obj: set){
            list1.add(obj);
        }
        return list1;
    }

}
