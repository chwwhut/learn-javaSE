package method;

/*
1．何为递归方法?方法自己调用自己的现象就称为递归。

2．递归方法分类:直接递归、间接递归

3．使用说明:
-递归方法包含了一种`隐式的循环`。
-递归方法会`重复执行`某段代码，但这种重复执行无须循环控制。
-递归一定要向`已知方向`递归，否则这种递归就变成了无穷递归，停不下来，类似于`死循环`。最终发生`栈内存溢出

注意:
1．递归调用会占用大量的系统堆栈，内存耗用多，在递归调用层次多时速度要比循环`慢的多
所以在使用递归时要慎重。
2．在要求高性能的情况下尽量避免使用递归，递归调用既花时间又`耗内存`。考虑使用循环迭代

 */

public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo demo = new RecursionDemo();

        //计算1-n的和，使用递归完成
        int n =5;
        int sum = demo.getSum(n);
        System.out.println(sum);
    }


    public int getSum(int n){
        if (n == 1){
            return 1;
        }
        return n + getSum(n-1);
    }

    //计算n！
    public int getMul(int n){
        if(n == 1){
            return 1;
        }else{
            return n*getMul(n-1);
        }
    }

    //快速排序、汉诺塔游戏

    //斐波那契数列
    public int f(int n){
        if(n == 1){
            return 1;
        } else if (n == 2) {
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }

    //举例 file类的对象表示一个文件目录
    //计算指定的文件目录的大小，遍历指定的文件目录中的所有的文件，删除指定的文件目录。
}
