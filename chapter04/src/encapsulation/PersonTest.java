package encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();

        b.setAge(24);
        System.out.println(b.getAge());
        b.setName("Alan");

        Person c = new Person(24,"peter");

        System.out.println(c.getAge());
        System.out.println(c.getName());

        b.getInfo();
        c.getInfo();
        boolean flag = b.compare(c);
        System.out.println(flag);
    }
}
