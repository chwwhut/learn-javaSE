package _selfdefine.exer3;

public class StudentTest {

    /*
        *   语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，数学老师希望成绩是89.5, 65.0，
            英语老师希望成绩是'A','B','C','D','E'
        * */
    public static void main(String[] args) {

        Student<String> s1 = new Student<>("Tom","良好");

        Student<Double> s2 = new Student<>("Jerry",87.5);

        Student<Character> s3 = new Student<>("Rose",'A');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
