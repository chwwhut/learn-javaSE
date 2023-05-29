package _file.exer3;

import java.io.File;

public class Exer03 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\chw\\Desktop\\java\\01_课件与电子教材\\尚硅谷_第15章_File类与IO流");
        printFileName(file);
    }
    public static void printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] fileArr = file.listFiles();
            for(File f: fileArr){
                printFileName(f);
            }
        }
    }
}
