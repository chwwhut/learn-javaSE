package method;
/*
1.方法重载

2．总结为:“两同一不同”
两同:同一个类、相同的方法名  一不同:参数列表不同。①参数个数不同参数类型不同
注意:方法的重载与形参的名、权限修饰符、返回值类型都没有关系。

3．举例


4．如何判断两个方法是相同的呢?（换句话说，编译器是如何确定调用的某个具体的方法呢?)
如何判断两个方法是相同的呢?方法名相同，且形参列表相同。(形参列表相同指的是参数个数和类型都相同，与形参名


5．在同一个类中不允许定义两个相同的方法。

 */
public class OverloadTest {
    public static void main(String[] args) {

        OverloadTest test = new OverloadTest();

        test.add(5,6);
    }

    public void add(int i ,int j){

    }

    public void add(int i ,int j,int k){

    }


    public void add(String s1 ,String s2){

    }
}
