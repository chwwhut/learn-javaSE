package method;

public class Test {
    public static void main(String[] args) {
        int a =10;
        int b = 10;

        Test test = new Test();

        test.method(a,b);//需要在method方法被调用之后，仅打印出a = 100,b =200,

        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    public void method(int a,int b){
        a = a*10;
        b = b*20;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }

}
