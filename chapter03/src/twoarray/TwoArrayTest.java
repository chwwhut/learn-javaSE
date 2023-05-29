package twoarray;

public class TwoArrayTest {

        public static void main(String[] args) {

            //静态初始化：数组变量的赋值和数组元素的赋值同时进行

            int[][] arr2 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};

            //动态初始化
            String[][] arr3 = new String[3][4];
            double[][] arr4 = new double[2][];

            //其他正确的写法
            int arr5[][] = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
            int[] arr6[] = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
            int arr7[][] = {{1,2,3},{4,5},{6,7,8,9}};//类型推断

            //数组元素的调用
            System.out.println(arr2[0][0]);

            System.out.println(arr2[0]);

            arr3[0][1] = "Tom";
            System.out.println(arr3[0][1]);
            System.out.println(arr3[0]);

            arr4[0] = new double[4];
            arr4[0][0] = 1.0;


            //数组的长度
            System.out.println(arr2.length);//3
            System.out.println(arr2[0].length);//3


            //如何遍历数组
            for(int i = 0; i < arr2.length; i++){
                for (int j = 0; j<arr2[i].length;j++){
                    System.out.print(arr2[i][j]+"\t");
                }
                System.out.println();
            }
            /*
            3．二维数组元素的默认初始化值
            3.1动态初始化方式1:(比如: int[][] arr = new int[3][4])
            1）外层元素，默认存储地址值。
            2）内层元素，默认与一维数组元素的不同类型的默认值规定相同。
                整型数组元素的默认初始化值:0
                >浮点型数组元素的默认初始化值:0.0
                >字符型数组元素的默认初始化值:0(或理解为'\u0000 ')> boolean型数组元素的默认初始化值:false
                >引用数据类型数组元素的默认初始化值:null
                3.2动态初始化方式2:(比如: int[][] arr = new int[3][])1）外层元素，默认存储null
                2)内层元素，不存在的。如果调用会报错（NullPointerException)|
             */

            int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

            int sum = 0;
            for(int i = 0; i < arr.length;i++){
                for(int j =0; j<arr[i].length;j++){
                    sum += arr[i][j];
                }
            }

            System.out.println("总和为：" + sum);





        }
}

