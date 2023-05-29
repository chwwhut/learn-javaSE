package method;

public class OverLoadExer {


    public static void main(String[] args) {
        OverLoadExer test = new OverLoadExer();

        test.m0L(6);
        test.m0L(5,6);
        test.m0L("hello,world");
    }




    public void m0L(int num){
        System.out.println(num*num);
    }

    public void m0L(int num1,int num2){
        System.out.println(num1*num2);
    }

    public void m0L(String message){
        System.out.println(message);
    }

    //求两个int值中的最大值
    public int max(int i,int j){
        return (i>=j)? i : j;
    }

    //求两个double值中的最大值
    public double max(double d1,double d2){
        return (d1>=d2)? d1:d2;
    }

    //求三个double值中的最大值
    public double max(double d1,double d2,double d3){
        double tempMax = max(d1,d2);
        return max(tempMax,d3);
    }

}
