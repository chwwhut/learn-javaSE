package _Polymorphism;

public class ClassCastTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        //向上转型
        Pet pet = new Dog();
        pet.setNickname("小白");
        pet.eat();

        //向下转型
        Dog d = (Dog) pet;
        System.out.println("d.nickname"+d.getNickname());
        d.eat();
        d.watchHouse();//可以调用子类扩展的方法watchHouse

        //Cat c = (Cat) pet;
        //编译通过，因为从语法检查来说，pet的编译时类型是Pet，Cat是Pet的子类，所以向下转型语法正确
        //这句代码运行报错ClassCastException，因为pet变量的运行时类型是Dog，Dog和Cat之间是没有继承关系的



    }
}
