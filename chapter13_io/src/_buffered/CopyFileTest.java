package _buffered;

import org.junit.Test;

import java.io.*;

public class CopyFileTest {

    @Test
    public void testSpendTime(){
        long start = System.currentTimeMillis();

        String src ="C:\\Users\\chw\\Desktop\\WeChat_20230416155315.mp4";
        String dest ="C:\\Users\\chw\\Desktop\\WeChat_20230416155316.mp4";

//        copyFileWithBufferedStream(src,dest);
        copyFileWithFileStream(src,dest);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间：" + (end-start));


    }
    /*
     * 使用BufferedInputStream + BufferedOutputStream 复制文件
     * 缓冲流的基本原理：在创建流对象时，内部会创建一个缓冲区数组（缺省使用`8192个字节(8Kb)`的缓冲区），
     * 通过缓冲区读写，减少系统IO次数，从而提高读写的效率。
     * */
    public void copyFileWithBufferedStream(String src,String dest){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File(src);
            File destFile = new File(dest);

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[50];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /*
     * 使用FileInputStream + FileOutputStream 复制文件
     * */
    public void copyFileWithFileStream(String src,String dest){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File(src);
            File destFile = new File(dest);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);



            byte[] buffer = new byte[50];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
