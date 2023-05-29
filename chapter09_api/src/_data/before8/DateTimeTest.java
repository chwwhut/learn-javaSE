package _data.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
    /*
     * Date类的使用
     *
     * |--java.util.Date
     *   > 两个构造器的使用
     *   > 两个方法的使用：①toString() ② long getTime()
     *       |----java.sql.Date: 对应着数据库中的date类型
     *
     * */
    @Test
    public void test1(){
        Date date1 = new Date();//创建一个基于当前系统时间的Date的实例
        System.out.println(date1.toString());//Thu Apr 27 16:20:15 HKT 2023

        long millTimes = date1.getTime();
        System.out.println("对应的毫秒数为："+millTimes);//1682583728313

        Date date2 = new Date(1370202256045L);//创建一个基于指定时间戳的Date实例
        System.out.println(date2.toString());//Mon Jun 03 03:44:16 HKT 2013

    }
    @Test
    public void test2(){
        java.sql.Date date1 = new java.sql.Date(1370202256045L);
        System.out.println(date1.toString());//2013-06-03

        System.out.println(date1.getTime());//1370202256045
    }
    /*
     * SimpleDateFormat类：用于日期时间的格式化和解析
     * java.util.Data
     * 格式化：日期--->字符串
     * 解析：字符串 ---> 日期
     *
     * */
    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期--->字符串
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);//2023/4/27 下午4:38

        //解析： 字符串-->日期
        Date date2 = sdf.parse("2023/4/27 下午4:38");
        System.out.println(date2);//Thu Apr 27 16:38:00 HKT 2023
    }
    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化：日期--->字符串
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);

        //解析：字符串 ---> 日期
        Date date2 = sdf.parse("2022-12-05 14:27:19");
        System.out.println(date2);

        //解析失败。因为参数的字符串不满足SimpleDateFormat可以识别的格式。
//        Date date3 = sdf.parse("22-12-5 下午2:21");
//        System.out.println(date2);
    }

    /*
     * Calendar:日历类
     * ① 实例化 由于Calendar是一个抽象类，所以我们需要创建其子类的实例。这里我们通过Calendar的静态方法
     *          getInstance()即可获取
     *
     * ②常用方法：get(int field) / set(int field,xx) / add(int field,xx) / getTime() / setTime()
     * */
    @Test
    public void test5(){
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());

        //测试方法
        //get(int field)
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set(int field,xx)
        calendar.set(Calendar.DAY_OF_MONTH,23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add(int field,xx)
        calendar.add(Calendar.DAY_OF_MONTH,3);
        calendar.add(Calendar.DAY_OF_MONTH,-5);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        ////getTime():Calender --> Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime():使用指定Date重置Calendar
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }
}
