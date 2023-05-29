package method;

/*

再谈方法之2:可变个数形参的方法（jdk5.0)

1．使用场景

在调用方法时，可能会出现方法形参的类型是确定的，但是参数的个数不确定。此时，我们就可以使用可变个数形参的方法

2．格式:(参数类型 ... 参数名)

3.说明：
可变个数形参的方法在调用时，针对于可变的形参赋的实参的个数可以为:0个、1个或多个

②可变个数形参的方法与同一个类中，同名的多个方法之间可以构成重载

特例:可变个数形参的方法与同一个类中方法名相同，且与可变个数形参的类型相同的数组参数不构成重载.

可变个数的形参必须声明在形参列表的最后

可变个数的形参最多在一个方法的形参列表中出现一次

 */

public class ArgsTest {

    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();

        test.print(1);
        test.print(1,2);

        test.print(new int[]{1,2,3});
        test.print(1,2,3);

    }

    public void print(int ... nums){
        System.out.println("1111");

        for(int i =0;i <nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    //public void print(int[] nums){
    //   for(int i =0;i <nums.length;i++){
    //        System.out.println(nums[i]);
    //与int ... nums 效果一样



}

