package _wrapper;

import org.junit.Test;

public class WrapperTest {
    /*
    基本数据类型 ---> 包装类：① 使用包装类的构造器 ② （建议）调用包装类的valueOf(xxx xx)
    包装类 ---> 基本数据类型：调用包装类的xxxValue()
     */
    //包装类 ---> 基本数据类型：调用包装类的xxxValue()
    /*
     * jdk5.0新特性：自动装箱、自动拆箱。
     * */

    //jdk5.0新特性：自动装箱、自动拆箱。
    @Test
    public void test4(){
        ////自动装箱:   基本数据类型 ---> 包装类
        int i1 =10;
        Integer ii1 = i1;//自动装箱
        System.out.println(ii1.toString());

        Integer ii2 = i1 +1;

        Boolean bb1 = true;

        Float ff1 = 12.3F;

        //自动拆箱:包装类 ---> 基本数据类型

        int i2 = ii1;//自动拆箱

        boolean b1 = bb1;//自动拆箱
    }


    //原来使用基本数据类型变量的位置，改成包装类以后，对于成员变量来说，其默认值变化了！//null
    @Test
    public void test3(){
        Account account = new Account();
        System.out.println(account.isFlag1);
        System.out.println(account.isFlag2);

        System.out.println(account.balance1);
        System.out.println(account.balance2);
    }





    //包装类 ---> 基本数据类型：调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer ii1 = new Integer(10);
        int i1 = ii1.intValue();
        i1 = i1+1;

        Float ff1 = Float.valueOf(12.3f);
        float f1 = ff1.floatValue();

        Boolean bb1 = Boolean.valueOf(true);
        boolean b1 = bb1.booleanValue();

    }



    //基本数据类型 ---> 包装类：① 使用包装类的构造器 ② （建议）调用包装类的valueOf(xxx xx)
    @Test
    public void test1(){

        //① 使用包装类的构造器
        int i1 = 10;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1.toString());


        float f1 = 12.3F;
        f1 = 32.2f;

        Float ff1 = new Float(f1);
        System.out.println(ff1.toString());

//        String s1 = "abc";
//        Float ff3 = new Float(s1);//报异常：NumberFormatException

        String s1 = "32.1";
        Float ff3 = new Float(s1);
        System.out.println(ff3.toString());

        String s2 = "false";
        s2 = "FaLse123";
        s2 = "TrUe";
        Boolean bb2 = new Boolean(s2);
        System.out.println(bb2); //false  --> true

        //推荐使用 ② （建议）调用包装类的valueOf(xxx xx)

        int i2 = 10;
        Integer ii2 = Integer.valueOf(i2);

        Boolean b2 = Boolean.valueOf(true);

        Float f2 = Float.valueOf(12.3F);
    }

}

class Account{
    boolean isFlag1;//false
    Boolean isFlag2;//null

    double balance1;//0.0
    Double balance2;//null
}
