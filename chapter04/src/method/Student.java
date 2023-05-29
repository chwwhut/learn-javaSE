package method;

public class Student {

    //属性

    int number;//学号

    int state;//年纪

    int score;//成绩

    //声明一个方法，显示学生的属性信息

    public String show(){
        return "number:" + number +"state:" + state + "score:" + score;
    }
}
