package _exer.exer1;

public class Exer3 {
    public static void main(String[] args) {
//        Person p1 = new Person("tom", -10);

        //1.使用有参的构造器
        try{
            Person p1 = new Person("Tom",-10);
            System.out.println(p1);
        }catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }


        //2.使用空参的构造器
        Person p2 = new Person();

        p2.setName("Jerry");
        p2.setLifeValue(10);
//        p2.setLifeValue(-10);

        System.out.println(p2);


    }
}
