package _communication;

//案例：使用两个线程打印 1-100。线程1, 线程2 交替打印
class PrintNumber implements Runnable{
    private int number = 1;
    Object obj = new Object();

    @Override
    public void run() {
        while (true){
//            synchronized (this){
            synchronized (obj){//此三个方法的调用者，必须是同步监视器。否则，会报IllegalMonitorStateException异常

                obj.notify();//此三个方法的使用，必须是在同步代码块或同步方法中。

                if(number<=100){
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }


            }
        }
    }
}
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p =new PrintNumber();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);

        t1.start();
        t2.start();


    }
}
