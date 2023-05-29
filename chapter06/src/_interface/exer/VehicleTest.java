package _interface.exer;

public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        //创建3个交通工具，保存在数组中
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特","红色");
        vehicles[1] = new ElectricVehicle("雅迪","天蓝色");
        vehicles[2] = new Car("奔驰","黑色","户AU888");

        for(int i = 0;i<vehicles.length;i++){
            developer.takingVehicle(vehicles[i]);

            if(vehicles[i] instanceof IPower){  //可以使用instanceof
                // vehicle只有run的抽象方法 强转为IPower以实现多态
                ((IPower) vehicles[i]).power();
            }
        }
    }
}
