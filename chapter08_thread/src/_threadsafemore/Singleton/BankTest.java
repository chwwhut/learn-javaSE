package _threadsafemore.Singleton;


public class BankTest {

    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 =new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        }; //创建两个线程t1,t2

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);


    }
}


class Bank{
    private Bank(){}

    private static volatile Bank bank = null;

    //实现线程安全的方式1  同步方法
//    public static synchronized Bank getInstance(){//同步监视器，默认为Bank.class
//
//        if(bank == null){
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            bank = new Bank();
//        }
//
//        return bank;
//    }


    //实现线程安全的方式2 同步代码块
//    public static Bank getInstance(){
//
//            synchronized (Bank.class){
//                if(bank ==null){
//
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    bank = new Bank();
//
//                }
//
//            }
//
//            return bank;//为什么在这里return？
//    }

    //实现线程安全的方式3:相较于方式1和方式2来讲，效率更高。为了避免出现指令重排，
    // 需要将instance声明为volatile
    public static Bank getInstance(){

        if (bank == null){

            synchronized (Bank.class){

                if(bank == null){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    bank = new Bank();
                }

            }

        }

        return bank;
    }

}
