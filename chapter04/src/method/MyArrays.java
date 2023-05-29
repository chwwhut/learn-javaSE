package method;

public class MyArrays {

    /**
     * 获取int[]数组的最大值
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */

    public int getMax(int[] arr){

        return 0;
    }

    public void print(int[] arr){//[12,231,34]
        System.out.print("[");

        for (int i =0; i<arr.length; i++){
            if(i == 0){
                System.out.println(arr[i]);
            }else{
                System.out.println("," +arr[i]);
            }
        }

        System.out.println("]");
    }

    public int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 使用线性查找的算法，查找指定的元素
     * @param arr 待查找的数组
     * @param target 要查找的元素
     * @return target元素在arr数组中的索引位置。若未找到，则返回-1
     */
    public int linearSearch(int[] arr, int target){

        for (int i=0; i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }

        //只要代码执行到此位置，一定是没找到
        return -1;

    }




}
