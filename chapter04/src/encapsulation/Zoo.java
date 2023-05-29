package encapsulation;

public class Zoo {
    public static void main(String[] args){
        Animal xb = new Animal();
        xb.setLegs(4);
        //xb.legs = -1000; 非法
        System.out.println(xb.getLegs());
    }
}
