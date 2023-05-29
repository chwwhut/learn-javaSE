package _object.toString;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14*radius*radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj instanceof Circle){
            Circle circle = (Circle)obj;
            return this.radius == circle.radius;
        }
        return false;
    }

    public String toString(){
        return "Circle[radius="+radius+"]";
    }
}
