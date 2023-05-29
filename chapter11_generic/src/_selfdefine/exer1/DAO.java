package _selfdefine.exer1;

import java.util.*;

public class DAO <T>{
    Map<String,T> map ;

    {
        map = new HashMap<>();
    }

    public void save(String id,T entity){//保存 T 类型的对象到 Map 成员变量中
        if(!map.containsKey(id)){

            map.put(id,entity);
        }
    }
    public T get(String id){
            return map.get(id);
    }
    public void update(String id,T entity){//替换 map 中key为id的内容,改为 entity 对象
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }
    public List<T> list(){ //返回 map 中存放的所有 T 对象
        //错误的
//        Collection<T> values = map.values();
//        System.out.println(values.getClass());
//        return (List<T>) values;//报ClassCastException异常。
        //因为values不是list ，内部是无序的，返回的是collection接口类型

        //正确的：(方式1)
//        Collection<T> values = map.values();
//        ArrayList<T> list = new ArrayList<>();
//        list.addAll(values);
//
//        return list;

        //正确的：(方式2)
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>(values);

        return list;  //?调用构造器



    }
    public void delete(String id){
        map.remove(id);
    }



}
