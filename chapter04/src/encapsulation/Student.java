package encapsulation;

public class Student {
    public static void main(String[] args) {
        Student chw = new Student("chw",24,"whut","jixie");

        System.out.println(chw.name+"\t"+ chw.age+"\t"+chw.school+"\t"+chw.major);
    }
    String name;
    int age;
    String school;
    String major;

    public Student(String n,int a){
        name = n;
        age = a;
    }

    public Student(String n,int a,String s){
        name = n;
        age = a;
        school = s;
    }

    public Student(String n,int a,String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
}
