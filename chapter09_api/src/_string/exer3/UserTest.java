package _string.exer3;

import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) {
        User[] arr = new User[3];
        arr[0] = new User("songhk","123");
        arr[1] = new User("Tom","8888");
        arr[2] = new User("Jerry","6666");

        System.out.println("库中的用户有：");
        for( int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();

        boolean isFlag = true;
        for(int i= 0; i< arr.length;i++){
            if (arr[i].getName().equals(userName)){
                isFlag = false;
                if(arr[i].getPassword().equals(password)){
                    System.out.println("登录成功"+userName);

                }else{
                    System.out.println("密码有误");
                }
                break;
            }
        }
        if (isFlag){
            System.out.println("没有该用户");
        }

        scanner.close();



    }
}
