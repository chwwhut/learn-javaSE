package _create.exer;

class OddNumberPrint extends Thread{//用于打印奇数

    @Override
    public void run() {
        for(int i =1;i<=100;i++){
            if(i % 2 !=0){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
            }
        }
    }
}
class EvenNumberPrint extends Thread{//用于打印偶数

    @Override
    public void run() {
        for(int i =1;i<=100;i++){
            if(i%2 ==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


public class PrintNumberTest {
    public static void main(String[] args) {
        //方式1：
//        OddNumberPrint t1 = new OddNumberPrint();
//        t1.start();
//
//        EvenNumberPrint t2 = new EvenNumberPrint();
//        t2.start();

        //方式2：创建Thread类的匿名子类的匿名对象。
//        new Thread(){
//            public void run(){
//                for (int i = 1; i <= 100; i++) {
//                    if(i % 2 == 0){
//                        System.out.println(Thread.currentThread().getName() + ":" + i);
//                    }
//                }
//            }
//        }.start();
//
//        new Thread(){
//            public void run(){
//                for (int i = 1; i <= 100; i++) {
//                    if(i % 2 != 0){
//                        System.out.println(Thread.currentThread().getName() + "--->" + i);
//                    }
//                }
//            }
//        }.start();

        //方式3：使用实现Runnable接口的方式：（提供了Runnable接口匿名实现类的匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

    }
}
