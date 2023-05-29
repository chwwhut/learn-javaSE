package encapsulation;

public class Person {
    private int age;
    private String name;

    public Person(){
        System.out.println("新对象实例化");
    }

    public Person(String name){
        this(); //调用本类中的无参构造器
        this.name = name;
    }

    public Person(int age , String name){
        this(name); //调用有一个参数的构造器
        this.age = age;
        this.name = name;
    }

    public boolean compare(Person p){
        return this.name == p.name;
    }

    public void setAge(int a){
        if(a<0 || a>130){
            System.out.println("你输入的年龄有误");
            return;
        }
        age = a;

    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void getInfo(){
        System.out.println("姓名："+name);
        this.speak();
    }

    public void speak(){
        System.out.println("年龄"+this.age);
    }
}
