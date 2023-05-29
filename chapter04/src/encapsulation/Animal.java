package encapsulation;

class Animal {
    private int legs;

    //构造器
    public Animal(){
        legs = 4;
    }

    public void setLegs(int i){
        if (i !=0 && i!=2 && i!=4){
            System.out.println("Wrong number of legs!");
            return;
        }
        legs = i;
    }

    public int getLegs(){
        return legs;
    }

}
