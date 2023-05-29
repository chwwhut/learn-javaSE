package method;
/*
再谈方法之3:方法的值传递机制

1．（复习)对于方法内声明的局部变量来说:如果出现赋值操作
>如果是基本数据类型的变量，则将此变量保存的数据值传递出去。
>如果是引用数据类型的变量，则将此变量保存的地址值传递出去。

2．方法的参数的传递机制:值传递机制

2.1概念（复习)

形参:

实参:

2.2规则

3．面试题:Java中的参数传递机制是什么? 值传递机制


 */

public class ValueTransferTest {
    public static void main(String[] args) {
        //1.基本数据类型的局部变量
        int m = 10;
        int n = m;

        System.out.println("m"+ m +",n=" + n);

        m++;

        System.out.println("m"+ m +",n=" + n);

        //2.引用数据类型的局部变量
        //2.1数组类型
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1;

        arr2[0] = 10;
        System.out.println(arr1[0]);//10

    }

    //数组排序，可以指明排序的方式（从小到达、从大到小）
    public void sort(int[] arr,String sortMethod){
        if("asc".equals(sortMethod)){ //自变量写在前面，规避空指针的问题。
            for(int j =0; j <arr.length-1; j++){
                for(int i =0; i < arr.length-j;i++){
                    if(arr[i]>arr[i+1]){
                        swap(arr,i,i+1);
                    }
                }

            }
        }else if ("desc".equals(sortMethod)){
            for(int j =0; j <arr.length-1; j++){
                for(int i =0; i < arr.length-j;i++){
                    if(arr[i]>arr[i+1]){
                        swap(arr,i,i+1);
                    }
                }

            }
        }else{
            System.out.println("你输入的排序方式有误");
        }
    }

    public void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
