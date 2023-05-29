package _extends.exer1;

public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        return 2*3.14*getRadius()*getRadius()+length*2*3.14*getRadius();
    }

    public double findVolume(){
        //return 3.14*getRadius()*getRadius()*length;
        return super.findArea()*length;
    }
}
