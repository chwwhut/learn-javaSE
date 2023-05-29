package _final;

public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }
    public void addOne(final Other o) {
        //o = new Other(); o不能变
        o.i++;    //o里的属性是可变的
    }
}
class Other {
    public int i;
}
