package exer01;

public class BinarySearchTest {
    public static void main(String[] args) {

        int[] arr2 = {2,4,5,8,12,15,19,26,37,49,51,66,89,100};

        //int target = 5;
        int target = 23;

        int head =0; //默认的首索引
        int end = arr2.length -1;//默认的尾序列

        boolean isFlag = false;//判断是否找到了指定元素

        while(head <= end){

            int middle = (head + end)/2;

            if(arr2[middle] == target){
                System.out.println("找到了" + target + ",对应的位置为，"+ middle);
                isFlag = true;
                break;
            } else if (arr2[middle] > target) {
                end = middle - 1;
            }else{
                head = middle + 1;
            }
        }

        if(!isFlag){
            System.out.println("不好意思，没有找到此元素");
        }
    }
}
