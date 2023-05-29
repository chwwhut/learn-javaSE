package exer01;

// 冒泡排序优化

public class Test19BubbleSort2 {
    public static void main(String[] args) {
        //int[] arr = {1,3,5,7,9,2,6};
        int[] arr = {1,3,5,7,9};

        //从小到大排序
        for(int i=0;i<arr.length-1;i++){
            boolean flag =true;//假设数组已经是有序的
            for(int j = 0;j<arr.length-1-i;j++){
                //希望交换的是arr【j】和arr【j+1】
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = false;//如果元素发生了交换，那么说明数组还没有排好序
                }
            }
            if(flag){
                break;
            }

        }
        //遍历
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
