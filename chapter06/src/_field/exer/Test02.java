package _field.exer;

public class Test02 {
    static int x, y, z;

    static {
        int x = 5;//局部变量x
        x--;
    }

    static {
        x--; // this.x
    }// x = -1

    public static void method() {
        y = z++ + ++z;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;
        method();
        System.out.println("result:" + (z + y + ++z));
    }
}
