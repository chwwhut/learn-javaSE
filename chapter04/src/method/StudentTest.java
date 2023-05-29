package method;

/*
1．何为对象数组﹖如何理解?
数组的元素可以是基本数据类型，也可以是引用数据类型。当元素是引用类型中的类时，我们称为对象数组。
2．举例:
String[ ],Person[ ] ,Student[],customer[]等
3．案例:
1）定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩score(in 。2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一:打印出3年级(state值为3）的学生信息。
问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息提示:
1)生成随机数:Math.random()，返回值类型double;
2)四舍五入取整:Math.round(double d)，返回值类型long。年级[1,6] : (int)(Math.random( ) * 6 + 1)
分数[0,100] : (int)(Math.random() * 101)

 */

public class StudentTest {

    public static void main(String[] args){

        //创建Student[]
        Student[] students = new Student[20];//String[] strs = new String[20] 对象数组



        //使用循环，给数组的元素赋值
        for(int i = 0; i<students.length;i++){
            students[i] = new Student();

            //给每一个学生对象的number、state、score属性赋值
            students[i].number = i+1;
            students[i].state = (int) (Math.random()*6+1);
            students[i].score = (int) (Math.random()*101);
        }

        //需求1：打印出3年纪（state值为3）的学生信息
        StudentUtil util = new StudentUtil();
        util.printStudentsWithState(students,3);


        //使用冒泡排序按学生成绩排序，并遍历所有学生信息

        util.sortStudents(students);

        //排序后遍历
        util.printStudents(students);
    }
}

