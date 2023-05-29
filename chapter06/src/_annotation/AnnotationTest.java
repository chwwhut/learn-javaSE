package _annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.walk();

        Person p2 = new Person("tom");
        System.out.println(p2);

        @SuppressWarnings("unused") int num = 10;
    }
}
@MyAnnotation("USA")
class Person{
    String name;
    int age;
    @MyAnnotation
    public Person(){}

    @Deprecated
    public Person(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }
}
