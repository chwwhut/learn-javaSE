package _Polymorphism;

public class PetShop {
    //返回值类型是父类类型，实际返回的是子类对象

    public Pet sale(String type){
        switch (type){
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();  //case穿透？
        }
        return null;
    }
}
