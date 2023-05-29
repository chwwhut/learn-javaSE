package _list.exer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入学生信息");

        while (true){

            System.out.println("1:继续录入，0：结束录入");
            int num = scanner.nextInt();
            if(num == 1){
                System.out.print("请输入学生的姓名：");
                String name = scanner.next();
                System.out.print("请输入学生的年龄：");
                int age = scanner.nextInt();

                list.add(new Student(name,age));

            } else if (num == 0) {
                break;

            }else {
                System.out.println("输入的数字有误");
            }

        }

        //遍历集合中的学生信息

        System.out.println("遍历学生信息：");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        scanner.close();


    }
}
