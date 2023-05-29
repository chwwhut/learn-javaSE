package _static;

public class ChineseTest {
    public static void main(String[] args) {
        System.out.println(Chinese.nation);
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age=40;
        c1.nation = "China";


        Chinese c2 = new Chinese();
        c2.name = "刘翔";
        c2.age = 39;

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c2.nation = "CHN";

        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c1.show();

        ChineseTest.test();

    }

    public static void test(){
        System.out.println("我是static的测试方法");
    }
}

class Chinese{
    String name;
    int age;

    static String nation;

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String food){
        System.out.println("我喜欢吃"+food);
    }

    public static void show(){
        System.out.println("我是一个中国人");

        //调用静态的结构
        System.out.println("nation= "+Chinese.nation);

        method1();

        //调用非静态结构, 静态方法不能调用非静态结构
        //System.out.println("name= "+this.name);
        //this.eat();
    }

    public static void method1(){
        System.out.println("我是静态的测试方法");
    }

    public void method2(){
        System.out.println("我是非静态的测试方法");

        System.out.println("name="+name);
        eat("饺子");

        //调用静态的结构
        System.out.println("nation= "+nation);

        method1();
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }
}
