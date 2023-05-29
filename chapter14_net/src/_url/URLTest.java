package _url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
    public static void main(String[] args) {
        String str = "https://picx.zhimg.com/80/v2-a9b667fd88e58eb04f6e83c9b6045f5f_720w.webp?source=1940ef5c";

        try {
            URL url = new URL(str);
        /*
            * - public String getProtocol( )   获取该URL的协议名
            - public String getHost( )      获取该URL的主机名
            - public String getPort( )      获取该URL的端口号
            - public String getPath( )      获取该URL的文件路径
            - public String getFile( )       获取该URL的文件名
            - public String getQuery(  )    获取该URL的查询名
            * */
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            System.out.println(url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
