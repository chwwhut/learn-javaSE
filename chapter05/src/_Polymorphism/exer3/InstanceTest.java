package _Polymorphism.exer3;

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Graduate());
    }
    public void method(Person e){
        System.out.println(e.getInfo());

        if(e instanceof Person){
            System.out.println("a person");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Graduate){
            System.out.println("a graduate student");
        }
    }
}
