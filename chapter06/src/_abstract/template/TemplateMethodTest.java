package _abstract.template;

public class TemplateMethodTest {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        System.out.println();
        BankTemplateMethod btm1 = new MamageMoney();
        btm1.process();
    }

}
abstract class BankTemplateMethod{
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }
    public abstract void transact();//办理具体的业务

    public void evaluate(){
        System.out.println("反馈评分");
    }

    //模板方法，把基本的操作组合到一起，子类一般不能重写
    public final void process(){
        this.takeNumber();

        this.transact();// 像个钩子，具体执行时，挂哪个子类，就执行哪个子类的实现代码

        this.evaluate();
    }
}

class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}
class MamageMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("我要理财");
    }
}

/*
**解决的问题**：

- 当功能内部一部分实现是确定的，另一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现。


- 换句话说，在软件开发中实现一个算法时，整体步骤很固定、通用，这些步骤已经在父类中写好了。
  但是某些部分易变，易变部分可以抽象出来，供不同子类实现。这就是一种模板模式。
 */