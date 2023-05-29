package _interface.exer;

public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电车通过电机驱动行驶");

    }

    @Override
    public void power() {
        System.out.println("电车使用电力提供动力");
    }
}
