package method;

public class StudentUtil {
    /*
    *打印出指定年纪的学生信息
    **/
    public void printStudentsWithState(Student[] students,int state){
        for(int i=0;i<students.length;i++){
            if(state == students[i].state){
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }

    public void printStudents(Student[] students){
        for (int i = 0; i< students.length;i++){
            System.out.println(students[i].show());
        }
    }



    //针对学生数组，按照score属性从低到高排列
    public void sortStudents(Student[] students){
        for(int i = 0;i < students.length-1;i++){
            for(int j =0;j<students.length-1-j;j++){
                if(students[j].score>students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }

}
