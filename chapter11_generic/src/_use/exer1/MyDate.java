package _use.exer1;

import java.util.Objects;

public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  year +"年"+  month +"月"+ day +"日";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    //按照生日从小到大排列
    @Override
    public int compareTo(MyDate o) {
        if(this == o){
            return 0;
        }
        int yearDistince = year - o.getYear();
                if(yearDistince != 0){
                    return yearDistince;
                }

                int monthDistince = month - o.getMonth();
                if(monthDistince != 0){
                    return monthDistince;
                }

                return day - o.getDay();
        }
}
