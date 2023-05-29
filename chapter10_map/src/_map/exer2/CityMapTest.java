package _map.exer2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CityMapTest {
    public static void main(String[] args) {
        //1. 获取Map，并遍历map中的所有的key
        Map map = CityMap.model;

        Set provinces = map.keySet();
        for(Object province : provinces){
            System.out.print(province+"\t");
        }

        //2. 根据提示，从键盘获取省份值，判断此省份是否存在，如果存在遍历其value中的各个城市。
        //如果不存在，提示用户重新输入
        Scanner scanner = new Scanner(System.in);
        String[] cities;

        while (true){
            System.out.println("\n请选择你所在的省份：");
            String province = scanner.next();
            //获取省份对应的各个城市构成的String[]
            cities = (String[]) map.get(province);

            if(cities == null || cities.length == 0){
                System.out.println("你输入的省份有误，请重新输入");
            }else{
                break;//意味着用户输入的省份是存在的，则跳出当前循环
            }
        }

        for(int i = 0;i<cities.length;i++){
            System.out.println(cities[i]+"\t\t");
        }
        System.out.println();
        //3. 根据提示，从键盘获取城市，遍历各个城市构成的String[],判断输入的城市是否存在于此数组中
        //如果存在，信息登记完毕。如果不存在，提示用户重新输入。
        l:while (true){
            System.out.println("请选择你所在的城市：");
            String city = scanner.next();

            //方式1：
            for(int i = 0;i<cities.length;i++){
                if(city.equals(cities[i])){
                    System.out.println("信息登记完毕");
                    break l;
                }
            }

            System.out.println("输入的城市有误，请重新输入");

        }

        scanner.close();
    }


}
class CityMap{

    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
        model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
        model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
    }

}