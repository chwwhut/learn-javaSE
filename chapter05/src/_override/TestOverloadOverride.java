package _override;

public class TestOverloadOverride {
    public static void main(String[] args) {
        Son s = new Son();
        s.method(1);

        Daughter d = new Daughter();
        d.method(1);
        d.method(1,2);

    }
}

class Father{
    public void method(int i){
        System.out.println("Father.method");
    }
}

class Son extends Father{
    @Override
    public void method(int i) {//重写
        System.out.println("Son.method");
    }
}

class Daughter extends Father{
    public void method(int i, int j ) {//重载
        System.out.println("Daughter.method");
    }
}
