package _object.toString;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle(3.4,"red",2.0);

        System.out.println("颜色是否相等？"+c1.getColor().equals(c2.getColor()));

        System.out.println("半径是否相等？"+c1.equals(c2));
        System.out.println(c2);
    }
}
