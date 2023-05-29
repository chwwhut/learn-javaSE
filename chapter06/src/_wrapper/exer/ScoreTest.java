package _wrapper.exer;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {

        //1. 创建Vector对象：Vector v=new Vector();
        Vector v = new Vector();

        Scanner scan = new Scanner(System.in);

        int maxScore = 0;//记录最高分

        //2. 从键盘获取多个学生成绩，存放到v中 （以负数代表输入结束）
        while (true){//for(;;)
            System.out.println("请输入学生成绩（以负数代表输入结束），");

            int intScore = scan.nextInt();

            if(intScore < 0 ){
                break;
            }

//            //装箱： int-->Integer对象
//            Integer score = Integer.valueOf(intScore);
//
//            //添加学生成绩到容器V中
//            v.addElement(score);

            //jdk5.0之后：自动装箱
            v.addElement(intScore);

            //3.获取学生成绩的最大值

            if(maxScore < intScore){
                maxScore = intScore;
            }

        }
        System.out.println("最高分："+maxScore);

        //4.依次获取v中的每个学生成绩，与最高分进行比较，获取学生等级，并输出
        for(int i =0;i<v.size(); i++){
            Object objScore = v.elementAt(i);
            //方式1：
//            Integer integerScore = (Integer) objScore;
//            //拆箱
//            int score = integerScore.intValue();

            //方式2：自动拆箱
            int score = (Integer)objScore;

            char grade;
            if(maxScore - score <=10){
                grade = 'A';
            } else if (maxScore - score <= 20) {
                grade = 'B';
            } else if (maxScore - score <= 30) {
                grade = 'C';
            }else{
                grade = 'D';
            }

            System.out.println("student"+ i +"score is"+ score+"grade is" +grade);


        }
        scan.close();

    }
}
