package _Polymorphism.exer4;

public class GeometricTest {
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println(g.findArea());
    }

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle circle = new Circle(2.3,"red",1.0);
        MyRectangle rectangle = new MyRectangle(2.0,3.0,"blue",1.0);

        System.out.println(test.equalsArea(circle, rectangle));
        test.displayGeometricObject(circle);
    }
}
