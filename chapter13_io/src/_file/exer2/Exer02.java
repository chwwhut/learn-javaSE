package _file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

public class Exer02 {
    /*
     * 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
     * */
    @Test
    public void test1(){
        File dir = new File("C:\\Users\\chw\\Desktop\\test\\abnormal");

        //方式1：
//        String[] listFiles = dir.list();
//        for(String s : listFiles){
//            if(s.endsWith(".jpg")){
//                System.out.println(s);
//            }
//        }

        //方式2：
        //public String[] list(FilenameFilter filter)

        String[] listFiles = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                if(name.endsWith(".jpg")){
//                    return true;
//                }else{
//                    return false;
//                }
                return name.endsWith(".jpg");
            }
        });

        for(String s: listFiles){
            System.out.println(s);
        }



    }
}
