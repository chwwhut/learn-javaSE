package _inner.exer;

public class ObjectTest{
    public static void main(String[] args) {
        SubObject sub1 = new SubObject();
        sub1.test();

        //提供一个继承于Object的匿名子类的匿名对象
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}

class SubObject extends Object{
    public void test(){
        System.out.println("尚硅谷");
    }
}
