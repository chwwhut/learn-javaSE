package array;

import java.util.Scanner;

public class ArrayExer03 {
    public static void main(String[] args) {

        //从键盘输入学生的人数，根据人数，创建数组（动态化）
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int count = scan.nextInt();

        int[] scores = new int[count];

        //根据提示，依次输入学生成绩，并将成绩保存在数组元素中
        //获取学生成绩的最大值
        System.out.println("请输入"+count+"个成绩");

        int maxScore = 0;
        for(int i =0;i<scores.length;i++){
            scores[i] = scan.nextInt();
            if(scores[i]> maxScore){
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是"+ maxScore);

        //遍历数组，根据学生成绩与最高分的差值，得到每个学生的等级，并输入成绩和等级
        char grade;
        for(int i =0 ;i<scores.length;i++){

            if(scores[i] >=maxScore-10){
                grade = 'A';
            }else if(scores[i]>maxScore-20){
                grade = 'B';
            }else if(scores[i]>maxScore-30){
                grade = 'C';
            }else{
                grade = 'D';
            }

            System.out.println("student" + i +"\tscore is\t" + scores[i] +
                    "\tgrade is " + grade);

        }



    }
}
