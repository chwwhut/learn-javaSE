public class AgeTest {
    public static void main(String[] args){
        int age = 75;

        if(age<0){
            System.out.println("不可能！");
        }else if(age>250){
            System.out.println("是个妖怪！");
        }else{
            System.out.println("人家芳龄"+age+",马马虎虎啦");
        }
    }
}
