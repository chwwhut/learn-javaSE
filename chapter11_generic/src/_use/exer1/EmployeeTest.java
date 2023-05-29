package _use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {


    @Test
    public void test1() {
        TreeSet<Employee> employees = new TreeSet<>();


        Employee e1 = new Employee("HanMeimei", 18, new MyDate(1998, 12, 21));
        Employee e2 = new Employee("LiLei", 20, new MyDate(1996, 11, 21));
        Employee e3 = new Employee("LiHua", 21, new MyDate(2000, 9, 12));
        Employee e4 = new Employee("ZhangLei", 19, new MyDate(1997, 5, 31));
        Employee e5 = new Employee("ZhangYi", 23, new MyDate(2001, 11, 2));

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            System.out.println(employee);

        }

    }

    @Test
    public void test2() {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                //正确的写法1：
//               int yearDistince = e1.getBirthday().getYear() - e2.getBirthday().getYear();
//               if(yearDistince != 0){
//                   return yearDistince;
//               }
//
//               int monthDistince = e1.getBirthday().getMonth() - e2.getBirthday().getMonth();
//               if (monthDistince !=0){
//                   return monthDistince;
//               }
//
//               return e1.getBirthday().getDay() - e2.getBirthday().getDay();

                //正确的写法2：
                return e1.getBirthday().compareTo(e2.getBirthday());


            }
        };

        TreeSet<Employee> employees = new TreeSet<>(comparator);


        Employee e1 = new Employee("HanMeimei", 18, new MyDate(1998, 12, 21));
        Employee e2 = new Employee("LiLei", 20, new MyDate(1996, 11, 21));
        Employee e3 = new Employee("LiHua", 21, new MyDate(2000, 9, 12));
        Employee e4 = new Employee("ZhangLei", 19, new MyDate(1997, 5, 31));
        Employee e5 = new Employee("ZhangYi", 23, new MyDate(2001, 11, 2));

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            System.out.println(employee);

        }
    }
}    //java: 进行语法分析时已到达文件结尾,是因为丢失了结尾的public class 类的大括号。
