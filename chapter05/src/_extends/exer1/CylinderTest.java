package _extends.exer1;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(3.4);
        cylinder.setRadius(2.7);
        System.out.println(cylinder.findVolume());
        System.out.println(cylinder.findArea());

        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println(circle.findArea());

    }
}
