package _inner;

public class OuterClassTest {
    public static void main(String[] args) {
        //1.创建Person的静态成员内部类的实例
        Person.Dog dog = new Person.Dog();

        dog.eat();

        //2.创建Person的非静态成员内部类的实例
        // Person.Bird bird = new Person.Bird();//报错，Bird不是一个封闭类

        //定义的B类不是静态的内部类，不能通过直接通过A.B()直接构建，要想实例化B类，先实例化A类，拿到A类对象的实例再实例化B类。

        Person p1 = new Person();
        Person.Bird bird = p1.new Bird();//正确的

        //或
        Person.Bird bird1 = new Person().new Bird();

        bird.eat();

        bird.show("小丽");

        bird.show1();





    }
}

class Person{//外部类
    String name = "tom";
    int age = 11;

    //静态内部成员类
    static class Dog{
        public void eat(){
            System.out.println("狗吃骨头");
        }
    }

    //非静态的成员内部类

    class Bird{
        String name = "啄木鸟";
        public void eat(){
            System.out.println("鸟吃虫子");
        }

        public void show(String name){
            System.out.println(age);//省略了Person.this
            System.out.println(name);//局部变量
            System.out.println(this.name);//内部类
            System.out.println(Person.this.name);//外部类
        }
        public void show1(){
            eat();
            this.eat();
            Person.this.eat();
        }
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void method(){
        //局部内部类（方法）

        class InnerClass1{

        }
    }

    public Person(){
        //局部内部类（构造器）
        class InnerClass1{

        }
    }

    {
        //局部内部类(代码块）
        class InnerClass1{

        }
    }


}
