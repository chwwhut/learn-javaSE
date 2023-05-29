package array;

public class ArrayExer {
    public static void main(String[] args) {
        // 声明数组
        double[] prices;
        prices = new double[]{20.32,43.31,43.22};

        //String[] foods;
        //foods = new String[]{"拌海蜇","龙须菜","仓冬笋"};

        //数组的声明和初始化
        //动态初始化
        String[] foods = new String[4];

        //int arr[] = new int[4];
        int[] arr1 = {1,2,3,4}; //类型推断

        // 数组的调用

        System.out.println(prices[0]);

        foods[0] = "拌海蜇";

        //遍历数组
        for(int i =0;i < prices.length; i++){
            System.out.println(prices[i]);
        }


        //arrayexer
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};

        String tel = "";

        for (int i =0; i < index.length ; i++ ){
            int value = index[i];
            tel += arr[value];
        }
        System.out.println("联系方式" + tel);

    }

}
