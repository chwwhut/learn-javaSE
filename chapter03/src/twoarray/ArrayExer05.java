package twoarray;

// 元素反转

public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        //遍历
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        //反转操作

        /*
        for(int i=0 ; i< arr.length/2;i++){
            //交换arr【i】与arr【arr。length-1-i】位置的元素
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
         */

        //方式2
        for(int i =0 ,j = arr.length-1;i<j; i++, j--){
            // 交换arr[i]与arr[j]位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //遍历
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
