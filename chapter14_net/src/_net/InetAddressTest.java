package _net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args)  {
        try {
            //1. 实例化
            //getByName(String host)：获取指定ip对应的InetAddress的实例
            InetAddress inet1 = InetAddress.getByName("192.168.23.31");
            System.out.println(inet1);// /192.168.23.31

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);//www.baidu.com/112.80.248.76

            //getLocalHost():获取本地ip对应的InetAddress的实例
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);//LAPTOP-CQS9HQ0L/10.117.168.160

            InetAddress inet4 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet4);///127.0.0.1

            //2.两个常用的方法
//        System.out.println(inet1.getHostName());//192.168.23.31
//        System.out.println(inet1.getHostAddress());//192.168.23.31

            System.out.println(inet2.getHostName());//www.baidu.com
            System.out.println(inet2.getHostAddress());//112.80.248.76
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
