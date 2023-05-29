package twoarray;

public class ArrayExer02 {
    public static void main(String[] args) {
        int[] scores = new int[]{5,4,6,8,9,0,1,2,7,3};

        int min = scores[0];
        int max = scores[0];
        int sum = 0;

        for(int i =0; i <scores.length; i++){

            sum += scores[i];

            if(scores[i] < min){
                min = scores[i];
            }

            if(max < scores[i]){
                max = scores[i];
            }
        }

        int avg = (sum - max- min) / (scores.length - 2);
        System.out.println("去掉最低分和最高分之后，平均分为：" + avg);


    }
}
