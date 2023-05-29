package _Polymorphism;

public class Person {
    private Pet pet;

    public void adopt(Pet pet){//形参是父类类型，实参是子类对象
        this.pet = pet;
    }
    public void feed(){//pet实际引用的对象类型不同，执行的eat方法也不同
        pet.eat();
    }
}
