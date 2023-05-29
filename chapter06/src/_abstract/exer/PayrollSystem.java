package _abstract.exer;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee[] emps = new Employee[2];

        //MyDate date1 = new MyDate(2000,11,1);
        //emps[0] = new SalariedEmployee("TOM",1001,date1,18000);

        emps[0] = new SalariedEmployee("张晓亮",1001,
                new MyDate(1992,12,21),18000);

        MyDate date2 = new MyDate(1999,6,4);
        emps[1]=new HourlyEmployee("Alan",1002,date2,200,100);

        System.out.println("请输入当前的月份");
        int month1 = scanner.nextInt();

        for(int i =0;i<emps.length;i++){
            System.out.println(emps[i].toString());
            System.out.println("工资为："+emps[i].earnings());




            if(month1 == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！加薪100");
            }

        }

        scanner.close();




    }
}
