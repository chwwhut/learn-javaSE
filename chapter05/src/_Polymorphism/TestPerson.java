package _Polymorphism;
//方法的形参声明体现多态
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();

        Dog dog =new Dog();
        dog.setNickname("小白");
        person.adopt(dog);//实参是dog子类对象，形参是父类pet类型
        person.feed();

        Cat cat = new Cat();
        cat.setNickname("雪球");
        person.adopt(cat);//实参是cat子类对象，形参是父类Pet类型
        person.feed();
    }
}
