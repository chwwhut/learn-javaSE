package _data.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
    /*
    * - 可变性：像日期和时间这样的类应该是不可变的。
     - 偏移性：Date中的年份是从1900开始的，而月份都从0开始。
     - 格式化：格式化只对Date有用，Calendar则不行。
     - 此外，它们也不是线程安全的；不能处理闰秒等。
    *
    * */
    @Test
    public void test1(){
        //体会Calendar的可变性
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
    @Test
    public void test2(){
        ////偏移性：Date中的年份是从1900开始的，而月份都从0开始。
        Date date = new Date(2022,11,14);
        System.out.println(date);//Thu Dec 14 00:00:00 HKT 3922
    }

    /*
     * JDK8的api:LocalDate \ LocalTime \ LocalDateTime
     * */
    @Test
    public void test3(){
        //now():获取当前日期和时间对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime);//17:18:12.270108700
        System.out.println(localDate);//2023-04-27
        System.out.println(localDateTime);//2023-04-27T17:18:12.270108700

        //of():获取指定的日期、时间对应的实例
        LocalDate localDate1 = LocalDate.of(2021, 5, 23);
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 12, 5, 11, 23, 45);
        System.out.println(localDate1);
        System.out.println(localDateTime1);

        //getXXX()
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth());
        System.out.println(localDateTime2.getHour());

        //体现不可变性
        //withXxx()  set?
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(15);
        System.out.println(localDateTime2);//2023-04-27T17:22:22.402413
        System.out.println(localDateTime3);//2023-04-15T17:22:22.402413

        //plusXxx()
        LocalDateTime localDateTime4 = localDateTime2.plusDays(5);
        System.out.println(localDateTime2);//2023-04-27T17:22:22.402413
        System.out.println(localDateTime4);//2023-05-02T17:22:22.402413

    }
    /*
     * JDK8的api: Instant
     * */
    @Test
    public void test4(){
        //now():
        Instant instant = Instant.now();
        System.out.println(instant);
        //了解：
        OffsetDateTime instant1 = instant.atOffset(ZoneOffset.ofHours(8));//东8区
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(24123123312L);
        System.out.println(instant2);//1970-10-07T04:52:03.312Z

        long millTime = instant.toEpochMilli();
        System.out.println(millTime);

        System.out.println(new Date().getTime());

    }

    /*
     * JDK8的api: DateTimeFormatter
     * */
    @Test
    public void test5(){
        //自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //格式化：日期、时间-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String strDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println(strDateTime);//2023-04-27 18:25:32

        //解析：字符串 ---> 日期、时间
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2023-04-27 18:25:32");
        LocalDateTime localDateTime1 =LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime1);//2023-04-27T18:25:32
    }

}
