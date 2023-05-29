package _threadsafe.runnable;

//使用同步方法解决实现Runnable接口的线程安全问题。

class Window1 implements Runnable{

    int ticket = 1000;
    boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag){

            show();

        }
    }



    public synchronized void show(){//此时的同步监视器是：this。此题目中即为w1，是唯一的。
        if(ticket>0 ){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket);
            ticket--;

        }else {
            isFlag = false;
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1 = new Window1();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
