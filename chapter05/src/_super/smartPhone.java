package _super;

public class smartPhone extends phone{
    @Override
    public void showNum() {
        System.out.println("显示来电姓名");
        System.out.println("显示头像");

        super.showNum();//保留父类来电显示号码的功能
    }
}
