package array;

import java.util.Scanner;

public class ArrayExer02 {
    public static void main(String[] args) {

        //定义包含7个单词的数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //从键盘获取指定的数值，使用Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数值（1-7），");
        int day = scan.nextInt();

        if(day<1 || day>7){
            System.out.println("你输入的数据有误");
        }else {
            System.out.println(weeks[day - 1]);
        }

        scan.close();

    }
}
