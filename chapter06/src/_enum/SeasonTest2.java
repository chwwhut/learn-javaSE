package _enum;

public class SeasonTest2 {
    public static void main(String[] args) {
        Season2[] values = Season2.values();
        for(int i= 0;i<values.length;i++){
            values[i].show();
        }
    }
}
interface Info1{
    void show();
}

enum Season2 implements Info1{
    //1. 必须在枚举类的开头声明多个对象。对象之间使用,隔开

    //若需要每个枚举值在调用实现的接口方法呈现出不同的行为方式，则可以让每个枚举值分别来实现该方法

    SPRING("春天","春暖花开"){
        public void show(){
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        public void show(){
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        public void show(){
            System.out.println("秋意浓");
        }
    },
    WINTER("冬天","白雪皑皑"){
        public void show(){
            System.out.println("大约在冬季");
        }
    };

    //2. 声明当前类的对象的实例变量,使用private final修饰
    private final String seasonName;//季节的名称
    private final String seasonDesc;//季节的描述
    //3. 私有化类的构造器
    private Season2(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

}